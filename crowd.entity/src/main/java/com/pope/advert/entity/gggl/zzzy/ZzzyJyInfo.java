package com.pope.advert.entity.gggl.zzzy;

import java.io.Serializable;
import java.math.BigDecimal;

public class ZzzyJyInfo implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 
     */
    private String wid;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private BigDecimal dyjg;

    /**
     * 
     */
    private String zzzyId;

    /**
     * 
     * @return WID 
     */
    public String getWid() {
        return wid;
    }

    /**
     * 
     * @param wid 
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * 
     * @return NAME 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 
     * @return DYJG 
     */
    public BigDecimal getDyjg() {
        return dyjg;
    }

    /**
     * 
     * @param dyjg 
     */
    public void setDyjg(BigDecimal dyjg) {
        this.dyjg = dyjg;
    }

    /**
     * 
     * @return ZZZY_ID 
     */
    public String getZzzyId() {
        return zzzyId;
    }

    /**
     * 
     * @param zzzyId 
     */
    public void setZzzyId(String zzzyId) {
        this.zzzyId = zzzyId == null ? null : zzzyId.trim();
    }

    /**
     *
     * @mbggenerated 2017-12-24
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", name=").append(name);
        sb.append(", dyjg=").append(dyjg);
        sb.append(", zzzyId=").append(zzzyId);
        sb.append("]");
        return sb.toString();
    }
}