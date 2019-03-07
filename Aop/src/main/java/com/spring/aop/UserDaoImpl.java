package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDaoImpl implements UserDao {
    private static final Logger logger =  LoggerFactory.getLogger(UserDaoImpl.class);
    @Override
    public String insert() {
        logger.info("开始进入插值操作......");
        return "";
    }
}
