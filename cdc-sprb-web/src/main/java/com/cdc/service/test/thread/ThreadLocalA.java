package com.cdc.service.test.thread;

public class ThreadLocalA extends Thread {
	
	public void run() {
		
		try {
			
			for (int i = 0; i < 100; i++) {
				
				ThreadTools.tl.set("ThreadA" + (i + 1));
				System.out.println("ThreadA get value=" + ThreadTools.tl.get());
				Thread.sleep(200);
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
