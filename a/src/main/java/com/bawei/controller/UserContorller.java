package com.bawei.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bawei.pojo.User;
import com.bawei.service.UserService;

@Controller
public class UserContorller {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(User user,HttpSession session){
		System.out.println(user.getName());
		System.out.println(user.getPwd());
		User sele = userService.sele(user);
		if(sele==null){
			return "login";
		}else{
			session.setAttribute("userName", sele.getName());
			return "redirect:queryAll";
		}
	}
	@RequestMapping("/user")
	public String user(HttpSession session){
		session.removeAttribute("userName");
		session.invalidate();
		return "login";
	}
}
