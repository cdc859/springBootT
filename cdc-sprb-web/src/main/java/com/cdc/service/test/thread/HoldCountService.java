package com.cdc.service.test.thread;

import java.util.concurrent.locks.ReentrantLock;

public class HoldCountService {
	
	private ReentrantLock lock = new ReentrantLock();
	
	public void method1() {
		
		try {
			
			lock.lock();
			System.out.println("method1 getHoldCount=" + lock.getHoldCount());
			method2();
			
		} finally {
			lock.unlock();
		}
		
	}
	
	public void method2() {
		
		try {
			
			lock.lock();
			System.out.println("method2 getHoldCount=" + lock.getHoldCount());
		
		} finally {
			lock.unlock();
		}
		
	}

}
