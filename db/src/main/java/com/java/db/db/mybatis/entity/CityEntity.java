/*
 * 文件名: CityEntity.java
 * 文件编号: 
 * 版权: Copyright (c) 2020, Sinosoft and/or its affiliates. All rights reserved.Use is subject to license terms.
 * 描述: TODO
 * 创建人: zhanchaohan
 * 创建时间: 2020年05月08日 17:20
 * 修改人:
 * 修改时间: 2020年05月08日 17:20
 * 修改变更号: 
 * 修改内容: TODO
 */
package com.java.db.db.mybatis.entity;

/**
 * @Title CityEntity
 * @Description TODO
 * @author zhanchaohan
 * @date 2020年05月08日 17:20
 * @version V1.0
 * @see 
 * @since V1.0
 * 
 */
public class CityEntity {
    private int cityID;
    private String cityName;
    private int provincialID;
    public CityEntity () {
        super ();
    }
    public CityEntity ( int cityID, String cityName, int provincialID ) {
        super ();
        this.cityID = cityID;
        this.cityName = cityName;
        this.provincialID = provincialID;
    }
    public int getCityID () {
        return cityID;
    }
    public void setCityID ( int cityID ) {
        this.cityID = cityID;
    }
    public String getCityName () {
        return cityName;
    }
    public void setCityName ( String cityName ) {
        this.cityName = cityName;
    }
    public int getProvincialID () {
        return provincialID;
    }
    public void setProvincialID ( int provincialID ) {
        this.provincialID = provincialID;
    }
    
}
