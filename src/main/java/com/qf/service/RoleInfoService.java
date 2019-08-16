package com.qf.service;


import com.qf.mapper.RoleInfoMapper;
import com.qf.pojo.RoleInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class RoleInfoService extends BaseService{

    public RoleInfo selectRoleInfoById(int id){
        SqlSession sqlSession = this.getSqlSession();
        //1.通过sqlsession获取到RoleInfoMapper的代理对象
        RoleInfoMapper mapper = sqlSession.getMapper(RoleInfoMapper.class);
        RoleInfo roleInfos = mapper.selectRoleInfoById(1);

        sqlSession.close();
        return roleInfos;
    }
}
