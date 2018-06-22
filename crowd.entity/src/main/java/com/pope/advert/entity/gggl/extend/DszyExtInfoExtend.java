package com.pope.advert.entity.gggl.extend;

import java.io.Serializable;

import com.pope.advert.entity.gggl.DszyExtInfo;

public class DszyExtInfoExtend extends DszyExtInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ggdlfsDisplay;

	public String getGgdlfsDisplay() {
		return ggdlfsDisplay;
	}

	public void setGgdlfsDisplay(String ggdlfsDisplay) {
		this.ggdlfsDisplay = ggdlfsDisplay;
	}

	public String getHyDisplay() {
		return hyDisplay;
	}

	public void setHyDisplay(String hyDisplay) {
		this.hyDisplay = hyDisplay;
	}

	public String getSfxzhyDisplay() {
		return sfxzhyDisplay;
	}

	public void setSfxzhyDisplay(String sfxzhyDisplay) {
		this.sfxzhyDisplay = sfxzhyDisplay;
	}

	private String hyDisplay;

	private String sfxzhyDisplay;
}
