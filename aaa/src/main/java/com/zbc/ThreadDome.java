package com.zbc;

public class ThreadDome extends Thread {
	private Thread t;
	private String threadName;
	
	ThreadDome(String name){
		threadName = name;
		System.out.println("大毛:"+threadName);
	}
	@Override
	public void run() {
		System.out.println("二哈:"+threadName);
		for (int i = 0; i < 10; i++) {
			System.out.println("金毛:"+threadName+", "+i);
		}
	}
	public void start(){
		System.out.println("藏獒:"+threadName);
		if(t == null){
			t=new Thread(this,threadName);
			t.start();
		}
	}
	
	
	//主函数调用
	public static void main(String[] args) {
		ThreadDome thread1 = new ThreadDome("鸡腿");
		thread1.start();
		ThreadDome thread2 = new ThreadDome("鸭腿");
		thread2.start();
	}
}
