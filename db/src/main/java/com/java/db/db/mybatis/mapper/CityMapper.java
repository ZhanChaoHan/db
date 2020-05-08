/*
 * 文件名: CityMapper.java
 * 文件编号: 
 * 版权: Copyright (c) 2020, Sinosoft and/or its affiliates. All rights reserved.Use is subject to license terms.
 * 描述: TODO
 * 创建人: zhanchaohan
 * 创建时间: 2020年05月08日 17:26
 * 修改人:
 * 修改时间: 2020年05月08日 17:26
 * 修改变更号: 
 * 修改内容: TODO
 */
package com.java.db.db.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.java.db.db.mybatis.entity.CityEntity;

/**
 * @Title CityMapper
 * @Description TODO
 * @author zhanchaohan
 * @date 2020年05月08日 17:26
 * @version V1.0
 * @see 
 * @since V1.0
 * 
 */
public interface CityMapper {

    /****
     * @Results的基本用法。当数据库字段名与实体类对应的属性名不一致时，可以使用@Results映射来将其对应起来。
     * column为数据库字段名，porperty为实体类属性名，jdbcType为数据库字段数据类型，id为是否为主键。
     */
    @Select("SELECT * FROM city")
    @Results({
        @Result(property = "id",  column = "cityID"),
        @Result(property = "name", column = "cityName")
    })
    List<CityEntity> getAll();

    @Select("SELECT * FROM city WHERE cityID = #{id}")
    @Results({
        @Result(property = "cityID",  column = "cityID"),
        @Result(property = "cityName", column = "cityName")
    })
    CityEntity getOne(Long id);

    @Insert("INSERT INTO city(cityID,cityName,provincialID) VALUES(#{id}, #{name}, #{provincialID})")
    void insert(CityEntity user);

    @Update("UPDATE city SET cityID=#{cityID},cityName=#{cityName} WHERE cityID =#{cityID}")
    void update(CityEntity user);

    @Delete("DELETE FROM city WHERE cityID =#{id}")
    void delete(Long id);

}