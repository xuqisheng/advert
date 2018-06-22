package com.pope.advert.service.supply.gbzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.pope.advert.common.exception.ServiceException;
import com.pope.advert.entity.dto.QueryCondition;
import com.pope.advert.entity.gggl.gbzy.GbzyExtInfo;
import com.pope.advert.entity.gggl.gbzy.GbzyInfo;
import com.pope.advert.entity.gggl.gbzy.GbzyQtInfo;
import com.pope.advert.entity.gggl.gbzy.GbzySdInfo;
import com.pope.advert.entity.gggl.gbzy.extend.GbzyExtInfoExtend;
import com.pope.advert.entity.gggl.gbzy.extend.GbzyQtInfoExtend;
import com.pope.advert.entity.log.CustomOperateLog;
import com.pope.advert.service.dto.DataResult;

public interface GbzyQtInfoService {
	/**
	 *
	 * @mbggenerated 2017-12-24
	 */
	DataResult<Integer> deleteByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-24
	 */
	DataResult<Integer> insertSelective(GbzyQtInfo record, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-24
	 */
	DataResult<GbzyQtInfo> selectByPrimaryKey(String wid, CustomOperateLog log) throws ServiceException;

	/**
	 *
	 * @mbggenerated 2017-12-24
	 */
	DataResult<Integer> updateByPrimaryKeySelective(GbzyQtInfo record, CustomOperateLog log) throws ServiceException;

	DataResult<Integer> publishing(GbzyInfo gbzyInfo, GbzyQtInfo gbzyQtInfo, GbzyExtInfo gbzyExtInfo,
			CustomOperateLog log) throws ServiceException;;

	DataResult<List<GbzyQtInfoExtend>> selectByCondition(QueryCondition<GbzyQtInfoExtend> condition,
			CustomOperateLog log) throws ServiceException;
	DataResult<List<GbzyQtInfoExtend>> selectDisplayByCondition(QueryCondition<GbzyQtInfoExtend> condition,CustomOperateLog log) throws ServiceException;
	DataResult<Integer> deleteByGbzyId(@Param("gbzyId") String gbzyId, CustomOperateLog log) throws ServiceException;
	
	DataResult<Integer> delete(String gbzyId, CustomOperateLog log) throws ServiceException;
}
