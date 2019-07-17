package com.bawei.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MenuMainDao;
import com.bawei.pojo.MenuMain;
import com.bawei.service.MenuMainService;
@Service
public class MenuMainServiceImpl implements MenuMainService {
	@Autowired
	private MenuMainDao menuMainDao;

	@Override
	public int dele(int menuId) {
		// TODO Auto-generated method stub
		return menuMainDao.dele(menuId);
	}

	@Override
	public int delete(String[] str) {
		// TODO Auto-generated method stub
		return menuMainDao.delete(str);
	}

	@Override
	public int inset(MenuMain menumain) {
		// TODO Auto-generated method stub
		return menuMainDao.inset(menumain);
	}
	
}
