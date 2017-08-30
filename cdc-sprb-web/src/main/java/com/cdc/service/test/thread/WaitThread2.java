package com.cdc.service.test.thread;

public class WaitThread2 extends Thread {
	
	private Object object;
	
	public WaitThread2(Object object) {
		super();
		this.object = object;
	}
	
	public void run() {
		
		synchronized (object) {
			
			System.out.println("开始notify time=" + System.currentTimeMillis());
			
			object.notify();
			
			System.out.println("结束 notify time=" + System.currentTimeMillis());
			
		}
		
	}

}
