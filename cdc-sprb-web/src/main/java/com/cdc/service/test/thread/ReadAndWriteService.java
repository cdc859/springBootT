package com.cdc.service.test.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadAndWriteService {
	
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read() {
		
		try {
			
			lock.readLock().lock();
			System.out.println("threadName=" + Thread.currentThread().getName() + "获取读锁 " + System.currentTimeMillis());
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.readLock().unlock();
		}
		
	}
	
	public void write() {
		
		try {
			
			lock.writeLock().lock();
			System.out.println("threadName=" + Thread.currentThread().getName() + "获取写锁 " + System.currentTimeMillis());
			Thread.sleep(10000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.writeLock().unlock();
		}
		
	}

}
