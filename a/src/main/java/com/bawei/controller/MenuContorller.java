package com.bawei.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bawei.pojo.Main;
import com.bawei.pojo.Menu;
import com.bawei.pojo.MenuMain;
import com.bawei.service.MainService;
import com.bawei.service.MenuMainService;
import com.bawei.service.MenuService;
import com.github.pagehelper.PageInfo;

@Controller
public class MenuContorller {
	@Autowired
	private MenuService menuService;
	@Autowired
	private MenuMainService MenuMainService;
	@Autowired
	private MainService mainService;
	@RequestMapping("/queryAll")
	public ModelAndView queryAll(Menu menu,@RequestParam(required=false,defaultValue="1")int page,@RequestParam(required=false,defaultValue="2")int rows){
		ModelAndView m = new ModelAndView();
		System.out.println(menu.getMname());
		List<Menu> queryAll = menuService.queryAll(menu, page, rows);
		m.addObject("menus", new PageInfo<Menu>(queryAll));
		m.addObject("menu", menu);
		m.addObject("page", page);
		m.addObject("rows", rows);
		m.setViewName("list");
		return m;
	}
	//删除
	@RequestMapping("/dele")
	public String dele(int id){
		menuService.dele(id);
		MenuMainService.dele(id);
		return "redirect:queryAll";
	}
	//查看
	@RequestMapping("byId")
	public ModelAndView ById(int id){
		Menu byId = menuService.byId(id);
		ModelAndView m = new ModelAndView();
		m.addObject("menu", byId);
		m.setViewName("ById");
		return m;
	}
	//批量删除
	@RequestMapping("/delete")
	public String delete(String str){
		String[] split = str.split(",");
		menuService.delete(split);
		MenuMainService.delete(split);
		return "redirect:queryAll";
	}
	//新增
	@RequestMapping("/add")
	public String add(Menu menu){
		int flag=0;
		//1.向菜谱添加数据
		int add = menuService.add(menu);
		//2.向中间表输入数据
		int menuId = menu.getMenuId();
		//通过参数绑定  绑定到mains集合中
		List<Main> List = menu.getMains();//所有的mainId
		for (Main m : List) {
			MenuMain mm = new MenuMain(menuId, m.getMainId());
			flag = MenuMainService.inset(mm);
		}
		if(flag>0 && add>0){
			
			return "redirect:queryAll";
		}else{
			return "add";
		}
	}
	//回显
	@RequestMapping("/update")
	public ModelAndView update(int id){
		Menu update = menuService.update(id);
		List<Main> mainsele = mainService.mainsele();
		//所有主料的集合
		for (Main n : mainsele) {
			//当前菜的主料
			for (Main m : update.getMains()) {
				if(n.getMainId()==m.getMainId()){
					n.setGreen("+"+n.getGreen());//添加标记
				}
			}
		}
		ModelAndView m = new ModelAndView();
		m.addObject("menu", update);
		m.addObject("mainlist", mainsele);
		m.setViewName("update");
		return m;
	}
	//修改
	@RequestMapping("/toupdate")
	public @ResponseBody boolean toupdate(int menuId,String mname,int price,String[] str){
		System.out.println(menuId);
		System.out.println(price);
		System.out.println(mname);
		
		int aa=0;
		//先添加主表
		int toupdate = menuService.toupdate(menuId, mname, price);
		//删除中间表
		MenuMainService.dele(menuId);
		//插入中间表
		for(int i=0;i<str.length;i++){
			MenuMain menuMain = new MenuMain(menuId,Integer.parseInt(str[i]));
			aa = MenuMainService.inset(menuMain);
		}
		if(aa>0&&toupdate>0){
			return true;
		}else{
			return false;
		}
	}
}
