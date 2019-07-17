package com.bawei.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.MainDao;
import com.bawei.pojo.Main;
import com.bawei.service.MainService;

@Service
public class MainServiceImpl implements MainService {
	@Autowired
	private MainDao mainDao;
	@Override
	public List<Main> mainsele() {
		// TODO Auto-generated method stub
		return mainDao.mainsele();
	}
	
}
