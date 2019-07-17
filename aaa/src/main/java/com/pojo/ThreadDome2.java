package com.pojo;

public class ThreadDome2 extends Thread {
	private int baozi=1;
	
	private String threadName;
	
	public ThreadDome2() {
		super();
	}

	public ThreadDome2(String threadName) {
		super();
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		while(baozi<=10){
			System.out.println(threadName+"吃了"+baozi+"个包子");
			baozi++;
		}
	}
	
	
	public static void main(String[] args) {
		ThreadDome2 thread1 = new ThreadDome2("马鸿历");
		ThreadDome2 thread2 = new ThreadDome2("刘腾飞");
		
		thread1.setPriority(MAX_PRIORITY);
		thread2.setPriority(MIN_PRIORITY);
		
		
		thread1.start();
		thread2.start();
		
	}
}	
