package com.cdc.service.test.thread;


public class AtomicThread2 extends Thread {
	
	private AtomicService as;
	
	public AtomicThread2(AtomicService as) {
		this.as = as;
	}
	
	public void run() {
		
		as.run();
		
	}

}
