package com.cdc.service.test.thread;

public class StackProductThread extends Thread {
	
	private MyStackPService p;
	
	public StackProductThread(MyStackPService p) {
		this.p = p;
	}
	
	public void run() {
		
		while(true) {
			p.pushService();
		}
		
	}

}
