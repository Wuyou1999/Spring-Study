package com.spring.IoC;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations={"/spring.xml"})

public class UserLoginTest {
    //  自动注入
    @Autowired
    private UserLogin userlogin;
    @Test
    public void userLogin() throws Exception{
        assertEquals(true,userlogin.userLogin(userlogin.getUser()));
    }
}