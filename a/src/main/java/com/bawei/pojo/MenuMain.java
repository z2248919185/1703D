package com.bawei.pojo;

public class MenuMain {
	private int menuMainId;
	private int menuId;
	private int mainId;
	public int getMenuMainId() {
		return menuMainId;
	}
	public void setMenuMainId(int menuMainId) {
		this.menuMainId = menuMainId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getMainId() {
		return mainId;
	}
	public void setMainId(int mainId) {
		this.mainId = mainId;
	}
	public MenuMain() {
		super();
	}
	public MenuMain(int menuId, int mainId) {
		super();
		this.menuId = menuId;
		this.mainId = mainId;
	}
	
}
