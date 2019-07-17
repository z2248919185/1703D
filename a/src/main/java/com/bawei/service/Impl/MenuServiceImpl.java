package com.bawei.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MenuDao;
import com.bawei.pojo.Menu;
import com.bawei.service.MenuService;
import com.github.pagehelper.PageHelper;

@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	private MenuDao menuDao;

	@Override
	public List<Menu> queryAll(Menu menu, int page, int rows) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, rows);
		return menuDao.queryAll(menu);
	}

	@Override
	public int dele(int menuId) {
		// TODO Auto-generated method stub
		return menuDao.dele(menuId);
	}

	@Override
	public Menu byId(int menuId) {
		// TODO Auto-generated method stub
		return menuDao.byId(menuId);
	}

	@Override
	public int delete(String[] str) {
		// TODO Auto-generated method stub
		return menuDao.delete(str);
	}

	@Override
	public int add(Menu menu) {
		// TODO Auto-generated method stub
		return menuDao.add(menu);
	}

	@Override
	public Menu update(int menuId) {
		// TODO Auto-generated method stub
		return menuDao.update(menuId);
	}

	@Override
	public int toupdate(int menuId, String mname, int price) {
		// TODO Auto-generated method stub
		return menuDao.toupdate(menuId, mname, price);
	}
}
