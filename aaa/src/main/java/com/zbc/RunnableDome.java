package com.zbc;

public class RunnableDome implements Runnable{

	private Thread t;
	private String threadName;
	
	RunnableDome(String name) {
		threadName = name;
		System.out.println("大逼 :"+threadName);
	}

	@Override
	public synchronized void run() {
		System.out.println("龙仔:"+threadName);
		for(int i= 0;i<4;i++){
			System.out.println("三炮:" + threadName + ","+i);
		}
	}
	
	public void start(){
		System.out.println("淫威:"+threadName);
		if(t == null){
			t = new Thread(this,threadName);
			t.start();
		}
	}
	
	//主方法
	public static void main(String[] args) {
		RunnableDome r1 = new RunnableDome("苹果~");
		r1.start();
		
		
		RunnableDome r2 = new RunnableDome("提子~");
		r2.start();
		
	}
}
