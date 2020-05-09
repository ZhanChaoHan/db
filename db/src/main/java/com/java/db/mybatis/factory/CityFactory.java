/*
 * 文件名: CityFactory.java
 * 文件编号: 
 * 版权: Copyright (c) 2020, Sinosoft and/or its affiliates. All rights reserved.Use is subject to license terms.
 * 描述: TODO
 * 创建人: zhanchaohan
 * 创建时间: 2020年05月09日 11:35
 * 修改人:
 * 修改时间: 2020年05月09日 11:35
 * 修改变更号: 
 * 修改内容: TODO
 */
package com.java.db.mybatis.factory;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.java.db.mybatis.entity.CityEntity;


/**
 * @Title CityFactory
 * @Description TODO
 * @author zhanchaohan
 * @date 2020年05月09日 11:35
 * @version V1.0
 * @see
 * @since V1.0
 * 
 */
public class CityFactory {
    public String insertCity ( Map<String, Object> para ) {
        CityEntity city = (CityEntity) para.get ( "bean" ); //
        SQL sql = new SQL (); //SQL语句对象，所在包：org.apache.ibatis.jdbc.SQL

        sql.INSERT_INTO ( "city" );
        if ( city.getCityID ()+""!= null ) {
            sql.VALUES ( "cityID", city.getCityID ()+"" );
        }
        if ( city.getProvincialID ()+"" != null ) {
            sql.VALUES ( "provincialID", city.getProvincialID ()+"" );
        }
        if ( city.getCityName () != null ) {
            sql.VALUES ( "cityName", city.getCityName () );
        }
        return sql.toString ();
    }
}
