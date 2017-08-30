package com.cdc.service.test.thread;

public class NofityServiceThread2 extends Thread {
	
	private Object ob;
	
	public NofityServiceThread2(Object ob) {
		this.ob = ob;
	}
	
	public void run() {
		
		 NofityService ns = new  NofityService(ob);
		 ns.test();
		
	}

}
