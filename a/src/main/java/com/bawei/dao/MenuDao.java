package com.bawei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bawei.pojo.Menu;

public interface MenuDao {
	List<Menu> queryAll(Menu menu);//��ѯ�˵�
	int dele(int menuId);//ɾ��
	Menu byId(int menuId);//�鿴
	int delete(String[] str);//����ɾ��
	int add(Menu menu);//���
	Menu update(int menuId);//����
	int toupdate(@Param("menuId")int menuId,@Param("mname")String mname,@Param("price")int price);//�޸�
}
