package com.cdc.service.test.thread;

public class LockServiceThread extends Thread {
	
	private LockService ls;
	
	public LockServiceThread(LockService ls) {
		this.ls = ls;
	}
	
	public void run() {
		
		ls.testMethod();
		
	}

}
