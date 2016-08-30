package com.github.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dengyaming on 16/4/27.
 */
public class BaseServiceImpl implements InitializingBean {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected SqlSession sqlSession;

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
