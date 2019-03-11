package com.spring.orm.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用Dao接口
 * @param <T>
 */
public interface BaseDAO<T>extends Mapper<T>, MySqlMapper<T> {
}
