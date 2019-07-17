package com.bawei.pojo;

import java.util.List;

public class Menu {
	private int menuId;
	private String mname;
	private int price;
	private List<Main> mains;
	
	public List<Main> getMains() {
		return mains;
	}
	public void setMains(List<Main> mains) {
		this.mains = mains;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Menu() {
		super();
	}
	
}
