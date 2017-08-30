package com.cdc.service.test.thread;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class WaitQueneLenthService {
	
	public ReentrantLock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void method() {
		
		try {
			
			//lock.lock();
			lock.lockInterruptibly();
			System.out.println(" lock begin threadName " + Thread.currentThread().getName());
			
			for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
				String newString = new String();
				Math.random();
			}
			
			System.out.println(" lock end threadName " + Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void method5() {
		
		try {
			
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.SECOND, 10);
			
			lock.lock();
			System.out.println("wait begin");
			condition.awaitUntil(calendar.getTime());
			System.out.println("wait end");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
			
		}
		
	}
	
	public void method4() {
		
		try {
			
			lock.lock();
			System.out.println("wait begin");
			condition.awaitUninterruptibly();
			//condition.await();
			System.out.println("wait end");
			
		} finally {
			
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
			
		}
		
	}
	
	public void method3() {
		
		try {
			
			if (lock.tryLock(3, TimeUnit.SECONDS)) {
				
				System.out.println("threadName " + Thread.currentThread().getName() + "获取锁的时间=" + System.currentTimeMillis());
				Thread.sleep(10000);
				
			} else {
				System.out.println("threadName " + Thread.currentThread().getName() +"未获得锁");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
			
		}
		
	}
	
	public void method2() {
		
		if (lock.tryLock()) {
			System.out.println("获取锁");
		} else {
			System.out.println("未获取锁");
		}
		
	}
	
	public void method1() {
		
		try {
			
			System.out.println("isLock()=" + lock.isLocked());
			System.out.println("threadName " + Thread.currentThread().getName() + "当前线程是否占有锁:" + lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println("isLock()=" + lock.isLocked());
			System.out.println("threadName " + Thread.currentThread().getName() + "当前线程是否占有锁:" + lock.isHeldByCurrentThread());
			System.out.println("threadName " + Thread.currentThread().getName() + "进入方法");
			Thread.sleep(Integer.MAX_VALUE);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void waitMethod() {
		
		try {
			
			lock.lock();
			condition.await();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void notityMethod() {
		
		try {
			
			lock.lock();
			System.out.println("有没有线程在等待condition=" + lock.hasWaiters(condition)  + "有 " + lock.getWaitQueueLength(condition) + "在等待线程");
			condition.signal();
			System.out.println("有没有线程在等待condition=" + lock.hasWaiters(condition)  + "有 " + lock.getWaitQueueLength(condition) + "在等待线程");
			
		} finally {
			lock.unlock();
		}
		
	}

}
