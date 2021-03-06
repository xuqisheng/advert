package com.pope.advert.entity.yhgl.extend;

import java.io.Serializable;

import com.pope.advert.entity.yhgl.CompanyZzInfo;

public class CompanyZzInfoExtend extends CompanyZzInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String zzlxDisplay;
	
	private String shztDisplay;
	
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getZzlxDisplay() {
		return zzlxDisplay;
	}

	public void setZzlxDisplay(String zzlxDisplay) {
		this.zzlxDisplay = zzlxDisplay;
	}

	public String getShztDisplay() {
		return shztDisplay;
	}

	public void setShztDisplay(String shztDisplay) {
		this.shztDisplay = shztDisplay;
	}

}