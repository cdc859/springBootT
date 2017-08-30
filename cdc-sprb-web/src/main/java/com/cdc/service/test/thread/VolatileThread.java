package com.cdc.service.test.thread;

public class VolatileThread extends Thread {
	
	//volatile 加了同步关键字后可以无需加这个关键字
	public static int count;
	
	synchronized public static void addCount() {//同步时记得加上static，保证类的同步
		
		for (int i = 0; i < 100; i++) {
			count++;
		}
		
		System.out.println("count=" + count);
		
	}
	
	public void run() {
		addCount();
	}

}
