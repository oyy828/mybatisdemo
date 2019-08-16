package com.qf.service;

import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserInfoService extends BaseService{
    public List<UserInfo> userLoginInit(){
        SqlSession sqlSession = this.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        List<UserInfo> userInfos = mapper.userLoginInit();
        sqlSession.close();
        return  userInfos;
    }
}
