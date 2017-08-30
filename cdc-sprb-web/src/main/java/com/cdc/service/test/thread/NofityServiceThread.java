package com.cdc.service.test.thread;

public class NofityServiceThread extends Thread {
	
	private Object ob;
	
	public NofityServiceThread(Object ob) {
		this.ob = ob;
	}
	
	public void run() {
		
		 NofityService ns = new  NofityService(ob);
		 ns.test();
		
	}

}
