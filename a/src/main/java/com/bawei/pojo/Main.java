package com.bawei.pojo;

import java.util.List;

public class Main {
	private int MainId;
	private String green;
	private List<Main> mains;
	public int getMainId() {
		return MainId;
	}
	public void setMainId(int mainId) {
		MainId = mainId;
	}
	public String getGreen() {
		return green;
	}
	public void setGreen(String green) {
		this.green = green;
	}
	public List<Main> getMains() {
		return mains;
	}
	public void setMains(List<Main> mains) {
		this.mains = mains;
	}
	public Main() {
		super();
	}
	public Main(int mainId, String green) {
		super();
		MainId = mainId;
		this.green = green;
	}
	
}
