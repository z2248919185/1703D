package com.pojo;

public class ThreadDome1 {
	public static void main(String[] args) {
		MusicDome music = new MusicDome();
		music.setName("小王八蛋:");
		
		
		EatDome eat = new EatDome();
		Thread thread = new Thread(eat);
		thread.setName("大王八蛋：");
		
		music.start();
		thread.start();
	}
}
