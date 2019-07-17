package com.bawei.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bawei.dao.UserDao;
import com.bawei.pojo.User;
import com.bawei.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User sele(User user) {
		// TODO Auto-generated method stub
		return userDao.sele(user);
	}
	
	
}
