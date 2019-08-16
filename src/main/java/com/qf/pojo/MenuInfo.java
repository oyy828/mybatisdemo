package com.qf.pojo;

import java.util.List;

public class MenuInfo {
    int mid;
    String menuname;
    String menuicon;
    String menuurl;
    int parentid;
    List<RoleInfo> roleInfoList;
    List<RoleInfo> childMenus;

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getMenuicon() {
        return menuicon;
    }

    public void setMenuicon(String menuicon) {
        this.menuicon = menuicon;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public List<RoleInfo> getRoleInfoList() {
        return roleInfoList;
    }

    public void setRoleInfoList(List<RoleInfo> roleInfoList) {
        this.roleInfoList = roleInfoList;
    }

    public List<RoleInfo> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<RoleInfo> childMenus) {
        this.childMenus = childMenus;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "mid=" + mid +
                ", menuname='" + menuname + '\'' +
                ", menuicon='" + menuicon + '\'' +
                ", menuurl='" + menuurl + '\'' +
                ", parentid=" + parentid +
                ", roleInfoList=" + roleInfoList +
                ", childMenus=" + childMenus +
                '}';
    }
}
