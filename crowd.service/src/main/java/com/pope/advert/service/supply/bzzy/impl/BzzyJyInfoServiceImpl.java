package com.pope.advert.service.supply.bzzy.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pope.advert.dao.gggl.bzzy.BzzyJyInfoMapper;
import com.pope.advert.entity.gggl.bzzy.BzzyExtInfo;
import com.pope.advert.entity.gggl.bzzy.BzzyGsygInfo;
import com.pope.advert.entity.gggl.bzzy.BzzyInfo;
import com.pope.advert.entity.gggl.bzzy.BzzyJyInfo;
import com.pope.advert.entity.gggl.bzzy.BzzyJyInfo;
import com.pope.advert.entity.log.CustomOperateLog;
import com.pope.advert.service.dto.DataResult;
import com.pope.advert.service.supply.bzzy.BzzyExtInfoService;
import com.pope.advert.service.supply.bzzy.BzzyInfoService;
import com.pope.advert.service.supply.bzzy.BzzyJyInfoService;
import com.wisedu.crowd.common.code.YesNoEnum;
import com.wisedu.crowd.common.code.ShztEnum;
import com.wisedu.crowd.common.exception.ServiceException;
import com.wisedu.crowd.common.util.DateUtil;
import com.wisedu.crowd.common.util.StringUtil;

@Service("bzzyJyInfoService")
public class BzzyJyInfoServiceImpl implements BzzyJyInfoService {

	@Autowired
	private BzzyJyInfoMapper bzzyJyInfoMapper;

	@Autowired
	private BzzyInfoService bzzyInfoService;
	@Autowired
	private BzzyExtInfoService bzzyExtInfoService;
	@Override
	public DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(bzzyJyInfoMapper.deleteByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> insertSelective(BzzyJyInfo record, CustomOperateLog log) throws ServiceException {
		return DataResult.success(bzzyJyInfoMapper.insertSelective(record));
	}

	@Override
	public DataResult<BzzyJyInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException {
		return DataResult.success(bzzyJyInfoMapper.selectByPrimaryKey(wid));
	}

	@Override
	public DataResult<Integer> updateByPrimaryKeySelective(BzzyJyInfo record, CustomOperateLog log)
			throws ServiceException {
		return DataResult.success(bzzyJyInfoMapper.updateByPrimaryKeySelective(record));
	}
	
	@Override
	public DataResult<Integer> publishing(BzzyInfo bzzyInfo, BzzyJyInfo bzzyJyInfo, BzzyExtInfo bzzyExtInfo,
			CustomOperateLog log) throws ServiceException {
		String wid=bzzyInfo.getWid();
		boolean insert=false;
		if(StringUtil.isEmpty(wid)){
			insert=true;
			wid=StringUtil.getUuId();
			bzzyInfo.setWid(wid);
			bzzyInfo.setShzt(ShztEnum.DSH.getCode());
			bzzyInfo.setCjip(log.getCustomIp());
			bzzyInfo.setCjsj(DateUtil.getCurrentDateTimeStr());
			bzzyInfo.setRegisterId(log.getUserId());
			bzzyJyInfo.setWid(StringUtil.getUuId());
			bzzyExtInfo.setWid(StringUtil.getUuId());
			
			
		}
		bzzyExtInfo.setBzzyId(wid);
		bzzyInfo.setRegisterId(log.getUserId());
		bzzyInfo.setDatastatus(YesNoEnum.YES.getCode());
		bzzyJyInfo.setBzzyId(wid);
		if(insert){
			bzzyInfoService.insertSelective(bzzyInfo, log);
			this.insertSelective(bzzyJyInfo, log);
			bzzyExtInfoService.insertSelective(bzzyExtInfo, log);
		}else{
			bzzyInfoService.updateByPrimaryKeySelective(bzzyInfo, log);
			this.updateByPrimaryKeySelective(bzzyJyInfo, log);
			bzzyExtInfoService.updateByPrimaryKeySelective(bzzyExtInfo, log);
		}
		return DataResult.success(1);
	}

}