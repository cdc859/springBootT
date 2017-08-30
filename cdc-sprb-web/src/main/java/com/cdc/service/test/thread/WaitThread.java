package com.cdc.service.test.thread;

public class WaitThread extends Thread {
	
	private Object object;
	
	public WaitThread(Object object) {
		super();
		this.object = object;
	}
	
	public void run() {
		
		try {
			
			synchronized (object) {
				
				System.out.println("开始 wait time=" + System.currentTimeMillis());
				
				object.wait();
				
				System.out.println("结束 wait time=" + System.currentTimeMillis());
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
