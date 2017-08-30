package com.cdc.service.test.thread;

public class MyThread2 extends Thread {
	
	private int count = 5;
	
	@Override
	synchronized public void run() {
		
		//int count = 5;// 如方法内定义变量是线程安全的
		
		super.run();
		count --;
		System.out.println(this.currentThread().getId() + "由" + this.currentThread().getName() + "计算，count：" + count);
		
	}

}
