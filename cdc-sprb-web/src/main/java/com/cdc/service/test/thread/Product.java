package com.cdc.service.test.thread;
import com.cdc.service.test.thread.ValueObject;
public class Product {
	
	private String lock;
	
	public Product(String lock) {
		this.lock = lock;
	}
	
	public void productValue() {
		
		try {
		
			synchronized (lock) {
				
				if (!ValueObject.value.equals("")) {
					
					System.out.println("生产者  Thread name:" + Thread.currentThread().getName() + " is waiting 了 ★");
					lock.wait();
					
				}
				
				System.out.println("生产者  Thread name:" + Thread.currentThread().getName() + " is runnable 了 ");
				
				String value = System.currentTimeMillis() + "_" + System.nanoTime();
				System.out.println("productValue is " + value);
				ValueObject.value = value;
				
				lock.notify();
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
