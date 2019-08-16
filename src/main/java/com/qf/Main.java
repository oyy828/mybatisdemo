package com.qf;

import com.qf.pojo.MenuInfo;
import com.qf.pojo.RoleInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.MenuInfoService;
import com.qf.service.RoleInfoService;
import com.qf.service.UserInfoService;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        RoleInfoService roleInfoService = new RoleInfoService();
//        RoleInfo roleInfo = roleInfoService.selectRoleInfoById(1);
//        System.out.println(roleInfo);

//        MenuInfoService menuInfoService = new MenuInfoService();
//        List<MenuInfo> menuInfos = menuInfoService.listParentMenu();
//        System.out.println(menuInfos);

        UserInfoService userInfoService = new UserInfoService();
        List<UserInfo> userInfos = userInfoService.userLoginInit();
        System.out.println(userInfos);



    }
}
