package com.cdc.service.test.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockService {
	
	private Lock lock = new ReentrantLock();
	
	public void testMethod() {
		
		lock.lock();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("thread name " + Thread.currentThread().getName() + " " + (i + 1));
		}
		
		lock.unlock();
		
	}

}
