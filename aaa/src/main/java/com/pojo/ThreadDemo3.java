package com.pojo;

public class ThreadDemo3 implements Runnable{

	private int baozi=1;
	
	private String threadName;
	
	

	public ThreadDemo3() {
		super();
	}

	
	
	public ThreadDemo3(String threadName) {
		super();
		this.threadName = threadName;
	}



	@Override
	public void run() {
		while(baozi<=10){
			synchronized (threadName) {
				if(baozi<=10){
					System.out.println(threadName+"吃了"+baozi+"个包子");
					baozi++;
				}
			
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo3 thread3 = new ThreadDemo3("大逼");
		Thread thread = new Thread(thread3);
		Thread thread2 = new Thread(thread3);
		
		
		thread.start();
		thread2.start();
	}
	
}
