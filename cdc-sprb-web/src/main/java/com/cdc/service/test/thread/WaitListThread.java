package com.cdc.service.test.thread;

public class WaitListThread extends Thread {
	
	private Object object;
	
	public WaitListThread(Object object) {
		this.object = object;
	}
	
	public void run() {
		
		try {
			
			synchronized (object) {
				
				if (WaitList.getListSize() != 5) {
					
					System.out.println("wait begin time=" + System.currentTimeMillis());
					object.wait();
					System.out.println("wait end time=" + System.currentTimeMillis());
					
				}
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
