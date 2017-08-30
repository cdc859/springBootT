package com.cdc.service.test.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditiconService {
	
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private Condition conditionC = lock.newCondition();
	private Condition conditionD = lock.newCondition();
	
	public void await() {
		
		try {
			
			lock.lock();
			System.out.println("await 前 时间为：" + System.currentTimeMillis());
			condition.await();
			System.out.println("await 后");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("lock 释放了");
		}
		
	}
	
	public void signal() {
		
		try {
			
			lock.lock();
			System.out.println("signal 时间为：" + System.currentTimeMillis());
			condition.signal();
			System.out.println("signal 后");
			
		} finally {
			lock.unlock();
			System.out.println("lock 释放了");
		}
		
	}
	
	public void awaitA() {
		
		try {
			
			lock.lock();
			System.out.println("begin awaitA  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("end awaitA  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void awaitB() {
		
		try {
			
			lock.lock();
			System.out.println("begin awaitB  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			condition.await();
			System.out.println("end awaitB  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void signalAll() {
		
		try {
			
			lock.lock();
			System.out.println("signalAll  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			condition.signalAll();
			
		} finally {
			lock.unlock();
			System.out.println("lock 释放了");
		}
		
	}
	
	public void awaitC() {
		
		try {
			
			lock.lock();
			System.out.println("begin awaitC  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionC.await();
			System.out.println("end awaitC  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void awaitD() {
		
		try {
			
			lock.lock();
			System.out.println("begin awaitD  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionD.await();
			System.out.println("end awaitD  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
	}
	
	public void signalAll_C() {
		
		try {
			
			lock.lock();
			System.out.println("signalAll_C  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionC.signalAll();
			
		} finally {
			lock.unlock();
			System.out.println("lock 释放了");
		}
		
	}
	
	public void signalAll_D() {
		
		try {
			
			lock.lock();
			System.out.println("signalAll_D  时间为：" + System.currentTimeMillis() + " ThreadName=" + Thread.currentThread().getName());
			conditionD.signalAll();
			
		} finally {
			lock.unlock();
			System.out.println("lock 释放了");
		}
		
	}

}
