package com.cdc.service.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicThread extends Thread {
	
	private AtomicInteger acount = new AtomicInteger(0);
	
	public void run() {
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(acount.incrementAndGet());
		}
		
	}

}
