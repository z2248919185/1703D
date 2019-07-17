package com.pojo;

public class MusicDome extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("听音乐");
		}
	}
}
