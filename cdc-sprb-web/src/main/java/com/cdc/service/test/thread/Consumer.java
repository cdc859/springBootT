package com.cdc.service.test.thread;
import com.cdc.service.test.thread.ValueObject;
public class Consumer {
	
	private String lock;
	
	public Consumer(String lock) {
		this.lock = lock;
	}
	
	public void consumerValue() {
		
		try {
		
			synchronized (lock) {
				
				if (ValueObject.value.equals("")) {
					
					System.out.println("消费者  Thread name:" + Thread.currentThread().getName() + " is waiting 了 ☆");
					lock.wait();
					
				}
				
				System.out.println("消费者  Thread name:" + Thread.currentThread().getName() + " is runnable 了");
				
				System.out.println("consumer is " + ValueObject.value);
				ValueObject.value = "";
				
				lock.notify();
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
