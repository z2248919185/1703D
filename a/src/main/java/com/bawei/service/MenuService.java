package com.bawei.service;

import java.util.List;

import com.bawei.pojo.Menu;

public interface MenuService {
	List<Menu> queryAll(Menu menu,int page,int rows);//查询菜单
	int dele(int menuId);//删除
	Menu byId(int menuId);//查看
	int delete(String[] str);//批量删除
	int add(Menu menu);//添加
	Menu update(int menuId);//回显
	int toupdate(int menuId,String mname,int price);//修改
}
