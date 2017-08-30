package com.cdc.service.test.thread;

public class ConsumerThread extends Thread {
	
	private Consumer c;
	
	public ConsumerThread(Consumer c) {
		this.c = c;
	}
	
	public void run() {
		
		while(true) {
			c.consumerValue();
		}
		
	}

}
