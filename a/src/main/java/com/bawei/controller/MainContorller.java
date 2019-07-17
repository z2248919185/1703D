package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.pojo.Main;
import com.bawei.service.MainService;

@Controller
public class MainContorller {
@Autowired
private MainService mainService;
@RequestMapping("/mainsele")
public @ResponseBody List<Main> show(){
	
	List<Main> mainsele = mainService.mainsele();
	
	return mainsele;
}
}
