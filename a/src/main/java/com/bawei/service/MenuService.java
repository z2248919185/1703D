package com.bawei.service;

import java.util.List;

import com.bawei.pojo.Menu;

public interface MenuService {
	List<Menu> queryAll(Menu menu,int page,int rows);//��ѯ�˵�
	int dele(int menuId);//ɾ��
	Menu byId(int menuId);//�鿴
	int delete(String[] str);//����ɾ��
	int add(Menu menu);//���
	Menu update(int menuId);//����
	int toupdate(int menuId,String mname,int price);//�޸�
}
