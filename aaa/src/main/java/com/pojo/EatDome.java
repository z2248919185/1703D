package com.pojo;

public class EatDome implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("赤饭!");
		}
		
	}
	
}
