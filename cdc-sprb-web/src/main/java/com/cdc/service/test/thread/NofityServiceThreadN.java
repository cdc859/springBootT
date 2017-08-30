package com.cdc.service.test.thread;

public class NofityServiceThreadN extends Thread {
	
	private Object ob;
	
	public NofityServiceThreadN(Object ob) {
		this.ob = ob;
	}
	
	public void run() {
		
		 synchronized (ob) {
			/* ob.notify();
			 ob.notify();
			 ob.notify();
			 ob.notify();
			 ob.notify();*/
			 ob.notifyAll();
		 }
		
	}

}
