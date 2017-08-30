package com.cdc.service.test.thread;

public class InheritableThread extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("在线程InheritableThread 取的值=" + ThreadTools.itl.get());
		}
		
	}

}
