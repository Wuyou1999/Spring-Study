package com.spring.orm.service.Impl;

import com.spring.orm.dao.UserDAO;
import com.spring.orm.entity.User;
import com.spring.orm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
//标注本类是一个Service组件
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDao;

  @Override
    public int insertUser(User user) {
        return userDao.insert(user);
    }

    @Override
    public int deleteUser(long id) {
        return userDao.deleteByPrimaryKey(id);
    }

    @Override
    public int updateUser(User user) {
        return userDao.updateByPrimaryKey(user);
    }

    @Override
    public List<User> selectUsers() {
        return userDao.selectAll();
    }

    @Override
    public User getUser(long id) {
        return userDao.selectByPrimaryKey(id);
    }
}