/*
 * 文件名: ProvincialMapper.java
 * 文件编号: 
 * 版权: Copyright (c) 2020, Sinosoft and/or its affiliates. All rights reserved.Use is subject to license terms.
 * 描述: TODO
 * 创建人: zhanchaohan
 * 创建时间: 2020年05月08日 17:59
 * 修改人:
 * 修改时间: 2020年05月08日 17:59
 * 修改变更号: 
 * 修改内容: TODO
 */
package com.java.db.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.java.db.mybatis.entity.ProvincialEntity;

/**
 * @Title ProvincialMapper
 * @Description TODO
 * @author zhanchaohan
 * @date 2020年05月08日 17:59
 * @version V1.0
 * @see 
 * @since V1.0
 * 
 */
public interface ProvincialMapper {
    @Insert("INSERT INTO provincial(provincialID,provincialName) VALUES(#{provincialID}, #{provincialName})")
    void insert(ProvincialEntity user);
    @Select("select * from provincial")
    List<ProvincialEntity> queryAll();
    @Select("SELECT * FROM provincial WHERE provincialID = #{id}") //3
    ProvincialEntity queryOne(int id);
}
