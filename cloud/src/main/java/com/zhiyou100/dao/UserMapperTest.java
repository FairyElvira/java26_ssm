package com.zhiyou100.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: java26_ssm
 * @description: 测试dao
 * @author: 作者
 * @create: 2020-10-10 20:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring_config.xml","classpath:springmvc_config.xml"})
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void getByUidTest(){
        System.out.println(userMapper.selectByPrimaryKey(1));
    }
}
