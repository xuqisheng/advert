package com.pope.advert.service.dto;

import java.io.Serializable;

import com.github.pagehelper.Page;
import com.pope.advert.common.code.HttpCodeEnum;
import com.pope.advert.entity.dto.PageInfo;

public class DataResult<T> implements Serializable {

	private static final long serialVersionUID = 8733472177254983171L;

	private boolean success = true;

	private int code = 0;

	private String msg;

	private PageInfo pageInfo;

	private T datas;

	public DataResult(boolean success, String msg, T datas) {
		this.success = success;
		this.msg = msg;
		this.datas = datas;
	}

	public DataResult(boolean success, String msg) {
		this.success = success;
		this.msg = msg;
	}
	public DataResult(boolean success,int code, String msg) {
		this.success = success;
		this.msg = msg;
		this.code=code;
	}

	public DataResult(T datas) {
		this.datas = datas;
	}

	public DataResult(T datas, PageInfo pageInfo) {
		this.pageInfo = pageInfo;
		this.datas = datas;
	}

	public DataResult() {
	}

	public static <T> DataResult<T> success() {
		return new DataResult<T>(true, HttpCodeEnum.SUCCESS.getName());
	}

	public static <T> DataResult<T> success(T data) {
		return new DataResult<T>(true, HttpCodeEnum.SUCCESS.getName(), data);
	}

	public static <T> DataResult<T> error() {
		return new DataResult<T>(false, HttpCodeEnum.FAIL.getName());
	}

	public static <T> DataResult<T> error(String msg) {
		return new DataResult<T>(false, msg);
	}
	public static <T> DataResult<T> error(int code,String msg) {
		return new DataResult<T>(false, code,msg);
	}

	public T getDatas() {
		return datas;
	}

	public void setDatas(T datas) {
		this.datas = datas;
	}

	public PageInfo getPageInfo() {
		return pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
