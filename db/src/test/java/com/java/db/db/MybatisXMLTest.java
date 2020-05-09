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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.java.db.mybatis.xml.dao.CityMapper;
import com.java.db.mybatis.xml.dao.ProvincialMapper;
import com.java.db.mybatis.xml.entity.Provincial;

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
@MapperScan("com.java.db.mybatis.xml.dao")//添加mapper包扫描避免所有类加@Mapper注解
//@Transactional //支持事物，@SpringBootTest 事物默认自动回滚
//@Rollback // 事务自动回滚，不自动回滚@Rollback(false)
@SpringBootTest
public class MybatisXMLTest {
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private ProvincialMapper provincialMapper;
    
    @Test
    public void testProvincialInsert() {
        Provincial provincial=new Provincial ();
        provincial.setProvincialid ( 77 );
        provincial.setProvincialname ( "七七" );
        provincialMapper.insert ( provincial);
    }
    @Test
    public void testProvincialQuery() {
      List<Provincial>provincialList= provincialMapper.selectAll ();
      for ( Provincial provincial : provincialList ) {
        System.out.println (  provincial.getProvincialid ()+"\t\t"+provincial.getProvincialname ());
    }
    }
}