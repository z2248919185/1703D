package com.pojo;

public class Person {
	private static void music(){
		for (int i = 0; i < 20; i++) {
			System.out.println("听音乐");
		}
	}
	private static void eat(){
		for (int i = 0; i < 20; i++) {
			System.out.println("赤饭!");
		}
	}
	public static void main(String[] args) {
		music();
		eat();
	}
}
