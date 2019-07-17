package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.Menu;

public interface MenuDao {
	List<Menu> queryAll(Menu menu);//查询菜单
	int dele(int menuId);//删除
	Menu byId(int menuId);//查看
	int delete(String[] str);//批量删除
	int add(Menu menu);//添加
	Menu update(int menuId);//回显
	int toupdate(@Param("menuId")int menuId,@Param("mname")String mname,@Param("price")int price);//修改
}
