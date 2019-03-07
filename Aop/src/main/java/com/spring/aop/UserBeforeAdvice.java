package com.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserBeforeAdvice {
    private static final Logger logger =  LoggerFactory.getLogger(UserDaoImpl.class);
    public void connection(){
        logger.info("连接数据库......");
    }
}
