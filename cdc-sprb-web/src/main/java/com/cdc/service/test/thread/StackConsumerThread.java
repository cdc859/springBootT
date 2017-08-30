package com.cdc.service.test.thread;

public class StackConsumerThread extends Thread {
	
	private MyStackCService p;
	
	public StackConsumerThread(MyStackCService p) {
		this.p = p;
	}
	
	public void run() {
		
		while(true) {
			p.popService();
		}
		
	}

}
