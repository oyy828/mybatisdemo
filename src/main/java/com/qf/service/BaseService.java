package com.qf.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import java.io.IOException;
import java.io.Reader;

public class BaseService {

    public SqlSession getSqlSession(){
        //调用RoleInfoMapper的selectRoleInfoById，拿到结果并返回
        String fileName = "mybatis-config.xml";

        Reader resourceAsReader = null;
        try {
            resourceAsReader = Resources.getResourceAsReader(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsReader);
        SqlSession sqlSession = build.openSession();
        return sqlSession;
    }
    //hhaa
}
