package com.qf.mapper;

import com.qf.pojo.MenuInfo;
import com.qf.service.BaseService;

import java.util.List;

public interface MenuInfoMapper {
    public List<MenuInfo> listParentMenu();
}
