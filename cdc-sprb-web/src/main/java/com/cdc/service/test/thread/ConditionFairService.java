package com.cdc.service.test.thread;

import java.util.concurrent.locks.ReentrantLock;

public class ConditionFairService {
	
	private ReentrantLock lock;
	
	public ConditionFairService(boolean isFair) {
		
		lock = new ReentrantLock(isFair);
		
	}
	
	public void serviceMethod() {
		
		try {
		
			lock.lock();
			System.out.println("公平锁情况：" + lock.isFair());
			System.out.println("threadName=" + Thread.currentThread().getName() + "获得锁");
			
		} finally {
			lock.unlock();
		}
		
	}

}
