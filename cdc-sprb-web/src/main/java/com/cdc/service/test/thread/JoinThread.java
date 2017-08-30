package com.cdc.service.test.thread;

public class JoinThread extends Thread  {
	
	public void run() {
		
		try {
			
			int value = (int)(Math.random() * 10000);
			System.out.println("value=" + value);
			Thread.sleep(value);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
