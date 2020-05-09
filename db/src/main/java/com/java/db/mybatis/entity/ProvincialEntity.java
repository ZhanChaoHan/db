/*
 * 文件名: ProvincialEntity.java
 * 文件编号: 
 * 版权: Copyright (c) 2020, Sinosoft and/or its affiliates. All rights reserved.Use is subject to license terms.
 * 描述: TODO
 * 创建人: zhanchaohan
 * 创建时间: 2020年05月08日 17:21
 * 修改人:
 * 修改时间: 2020年05月08日 17:21
 * 修改变更号: 
 * 修改内容: TODO
 */
package com.java.db.mybatis.entity;

/**
 * @Title ProvincialEntity
 * @Description TODO
 * @author zhanchaohan
 * @date 2020年05月08日 17:21
 * @version V1.0
 * @see 
 * @since V1.0
 * 
 */
public class ProvincialEntity {
    private int provincialID;
    private String provincialName;
    public ProvincialEntity () {
        super ();
    }
    public ProvincialEntity ( int provincialID, String provincialName ) {
        super ();
        this.provincialID = provincialID;
        this.provincialName = provincialName;
    }
    public int getProvincialID () {
        return provincialID;
    }
    public void setProvincialID ( int provincialID ) {
        this.provincialID = provincialID;
    }
    public String getProvincialName () {
        return provincialName;
    }
    public void setProvincialName ( String provincialName ) {
        this.provincialName = provincialName;
    }
    
}
