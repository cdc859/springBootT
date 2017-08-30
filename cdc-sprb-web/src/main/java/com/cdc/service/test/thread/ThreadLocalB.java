package com.cdc.service.test.thread;

public class ThreadLocalB extends Thread {
	
	public void run() {
		
		try {
			
			for (int i = 0; i < 100; i++) {
				
				ThreadTools.tl.set("ThreadB" + (i + 1));
				System.out.println("ThreadB get value=" + ThreadTools.tl.get());
				Thread.sleep(200);
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
