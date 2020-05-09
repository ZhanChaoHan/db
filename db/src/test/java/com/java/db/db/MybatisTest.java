/*
 * 文件名: MybatisTest.java
 * 文件编号: 
 * 版权: Copyright (c) 2020, Sinosoft and/or its affiliates. All rights reserved.Use is subject to license terms.
 * 描述: TODO
 * 创建人: zhanchaohan
 * 创建时间: 2020年05月08日 17:44
 * 修改人:
 * 修改时间: 2020年05月08日 17:44
 * 修改变更号: 
 * 修改内容: TODO
 */
package com.java.db.db;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java.db.mybatis.entity.CityEntity;
import com.java.db.mybatis.entity.ProvincialEntity;
import com.java.db.mybatis.mapper.CityMapper;
import com.java.db.mybatis.mapper.ProvincialMapper;
/**
 * @Title MybatisTest
 * @Description TODO
 * @author zhanchaohan
 * @date 2020年05月08日 17:44
 * @version V1.0
 * @see 
 * @since V1.0
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@MapperScan("com.java.db.mybatis.mapper")//添加mapper包扫描避免所有类加@Mapper注解
//@Transactional //支持事物，@SpringBootTest 事物默认自动回滚
//@Rollback // 事务自动回滚，不自动回滚@Rollback(false)
@SpringBootTest
public class MybatisTest {
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private ProvincialMapper provincialMapper;
    
    @Test
    public void testProvincialInsert() {
        provincialMapper.insert ( new ProvincialEntity ( 123, "一二三" ) );
        Assert.assertEquals(6,  provincialMapper.queryOne (123 ).getProvincialID ());
    }
    @Test
    public void testProvincialQuery() {
        List<ProvincialEntity>provincialEntity=provincialMapper.queryAll ();
        for ( ProvincialEntity provincialEntity2 : provincialEntity ) {
            System.out.println ( provincialEntity2.getProvincialID ()+"\t\t"+provincialEntity2.getProvincialName () );
        }
    }
    @Test
    public void testProvincialQueryOne() {
        Assert.assertEquals(6,  provincialMapper.queryOne (6 ).getProvincialID ());
        System.out.println (  provincialMapper.queryOne (6 ).getProvincialName () );
    }
    //City测试------------------------------------------------------------------------------------------------------------------
    @Test
    public void testCityGetAll() {
         List<CityEntity>cityEntity=cityMapper.getAll ();
         for ( CityEntity cityEntity2 : cityEntity ) {
            System.out.println ( cityEntity2.getCityID ()+"\t\t"+cityEntity2.getCityName ()+"\t\t"+cityEntity2.getProvincialID () );
        }
    }
    @Test
    public void testCityInsert() {
        cityMapper.insert ( new CityEntity ( 666, "六六六", 6 ) );
    }
    @Test
    public void testInsertProvider() {
        cityMapper.insertProvider ( new CityEntity ( 789, null, 5 ) );
    }
    @Test
    public void testCityUpdate() {
        cityMapper.update ( new CityEntity ( 666, "六六六八", 6 ) );
    }
    /*
    @Test
    public void testInsert() throws Exception {
        cityMapper.insert(new CityEntity(12, "a123456", 1254));
        cityMapper.insert(new CityEntity("bb1", "b123456", UserSexEnum.WOMAN));
        cityMapper.insert(new CityEntity("cc1", "b123456", UserSexEnum.WOMAN));

        Assert.assertEquals(3, cityMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<CityEntity> users = cityMapper.getAll();
        System.out.println(users.toString());
    }


    @Test
    public void testUpdate() throws Exception {
        CityEntity user = cityMapper.getOne(30l);
        System.out.println(user.toString());
        user.setNickName("neo");
        userMapper.update(user);
        Assert.assertTrue(("neo".equals(cityMapper.getOne(30l))));
    }
    */
}