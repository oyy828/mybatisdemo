package com.qf.service;

import com.qf.mapper.MenuInfoMapper;
import com.qf.pojo.MenuInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuInfoService extends BaseService{
    public List<MenuInfo> listParentMenu(){
        SqlSession sqlSession = this.getSqlSession();
        MenuInfoMapper mapper = sqlSession.getMapper(MenuInfoMapper.class);
        List<MenuInfo> menuInfos = mapper.listParentMenu();
        sqlSession.close();
        return menuInfos;
    }


}
