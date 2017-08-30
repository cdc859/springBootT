package com.cdc.service.test.thread;

public class NofityService {
	
	private Object ob;
	
	public NofityService(Object ob) {
		this.ob = ob;
	}
	
	public void test() {
		
		try {
			
			synchronized (ob) {
				
				System.out.println("thread name=" + Thread.currentThread().getName() + " begin wait.");
				
				ob.wait();
				//ob.wait(1000);
				
				System.out.println("thread name=" + Thread.currentThread().getName() + " end wait.");
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
