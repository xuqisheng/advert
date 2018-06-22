package com.pope.advert.service.supply.zzzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pope.advert.common.exception.ServiceException;
import com.pope.advert.entity.dto.QueryCondition;
import com.pope.advert.entity.gggl.gbzy.GbzyExtInfo;
import com.pope.advert.entity.gggl.zzzy.ZzzyExtInfo;
import com.pope.advert.entity.gggl.zzzy.ZzzyGsygInfo;
import com.pope.advert.entity.gggl.zzzy.ZzzyInfo;
import com.pope.advert.entity.gggl.zzzy.extend.ZzzyGsygInfoExtend;
import com.pope.advert.entity.log.CustomOperateLog;
import com.pope.advert.service.dto.DataResult;

public interface ZzzyGsygInfoService {
	  /**
    *
    * @mbggenerated 2017-12-24
    */
   DataResult<Integer> deleteByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-24
    */
   DataResult<Integer> insertSelective(ZzzyGsygInfo record,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-24
    */
   DataResult<ZzzyGsygInfo> selectByPrimaryKey(String wid,CustomOperateLog log) throws ServiceException;

   /**
    *
    * @mbggenerated 2017-12-24
    */
   DataResult<Integer> updateByPrimaryKeySelective(ZzzyGsygInfo record,CustomOperateLog log) throws ServiceException;
   
   DataResult<Integer> publishing(ZzzyInfo zzzyInfo, ZzzyGsygInfo zzzyGsygInfo, ZzzyExtInfo zzzyExtInfo,
			CustomOperateLog log) throws ServiceException;
   
   DataResult<List<ZzzyGsygInfoExtend>> selectByCondition(QueryCondition<ZzzyGsygInfoExtend> condition,
			CustomOperateLog log) throws ServiceException;

	DataResult<Integer> deleteByGbzyId(String zzzyId, CustomOperateLog log) throws ServiceException;
	
	DataResult<Integer> delete(String zzzyId, CustomOperateLog log) throws ServiceException;
}
