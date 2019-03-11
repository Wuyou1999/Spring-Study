package com.spring.orm.service.Impl;

import com.spring.orm.entity.User;
import com.spring.orm.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
//指定单元测试环境
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件路径
@ContextConfiguration(locations={"/Spring_mybatis.xml"})
public class UserServiceImplTest {
    @Autowired
    private UserService userService;

    @Test
    public void insertUser() {
        User user = new User();
        user.setAccount("1004");
        user.setPassword("123123");
        user.setCredits(666);
        int n = userService.insertUser(user);
        assertEquals(1, n);
    }

   @Test
    public void selectUsers() {
        List<User> users = userService.selectUsers();
        users.forEach(user -> System.out.println(user));
    }
    @Test
    public void deleteUser() {
        int n = userService.deleteUser(4);
        assertEquals(1,n);
    }
    @Test
    public void updateUser() {
        User user = userService.getUser(2);
        user.setPassword("888888");
        user.setCredits(250);
        int n = userService.updateUser(user);
        assertEquals(1, n);
    }
    @Test
    public void getUser() {
        User user = userService.getUser(1);
        System.out.println(user);
    }
}