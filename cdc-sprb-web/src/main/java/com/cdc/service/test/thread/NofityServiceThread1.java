package com.cdc.service.test.thread;

public class NofityServiceThread1 extends Thread {
	
	private Object ob;
	
	public NofityServiceThread1(Object ob) {
		this.ob = ob;
	}
	
	public void run() {
		
		 NofityService ns = new  NofityService(ob);
		 ns.test();
		
	}

}
