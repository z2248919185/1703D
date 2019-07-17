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
	//ɾ��
	@RequestMapping("/dele")
	public String dele(int id){
		menuService.dele(id);
		MenuMainService.dele(id);
		return "redirect:queryAll";
	}
	//�鿴
	@RequestMapping("byId")
	public ModelAndView ById(int id){
		Menu byId = menuService.byId(id);
		ModelAndView m = new ModelAndView();
		m.addObject("menu", byId);
		m.setViewName("ById");
		return m;
	}
	//����ɾ��
	@RequestMapping("/delete")
	public String delete(String str){
		String[] split = str.split(",");
		menuService.delete(split);
		MenuMainService.delete(split);
		return "redirect:queryAll";
	}
	//����
	@RequestMapping("/add")
	public String add(Menu menu){
		int flag=0;
		//1.������������
		int add = menuService.add(menu);
		//2.���м����������
		int menuId = menu.getMenuId();
		//ͨ��������  �󶨵�mains������
		List<Main> List = menu.getMains();//���е�mainId
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
	//����
	@RequestMapping("/update")
	public ModelAndView update(int id){
		Menu update = menuService.update(id);
		List<Main> mainsele = mainService.mainsele();
		//�������ϵļ���
		for (Main n : mainsele) {
			//��ǰ�˵�����
			for (Main m : update.getMains()) {
				if(n.getMainId()==m.getMainId()){
					n.setGreen("+"+n.getGreen());//��ӱ��
				}
			}
		}
		ModelAndView m = new ModelAndView();
		m.addObject("menu", update);
		m.addObject("mainlist", mainsele);
		m.setViewName("update");
		return m;
	}
	//�޸�
	@RequestMapping("/toupdate")
	public @ResponseBody boolean toupdate(int menuId,String mname,int price,String[] str){
		System.out.println(menuId);
		System.out.println(price);
		System.out.println(mname);
		
		int aa=0;
		//���������
		int toupdate = menuService.toupdate(menuId, mname, price);
		//ɾ���м��
		MenuMainService.dele(menuId);
		//�����м��
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
