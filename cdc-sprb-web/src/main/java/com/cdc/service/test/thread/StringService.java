package com.cdc.service.test.thread;

public class StringService {
	
	private String lock = "123";

	public static void print(String stringParam) {
		
		try {
			
			synchronized (stringParam) {
				
				while(true) {
					
					System.out.println("线程:" + Thread.currentThread().getName());
					Thread.sleep(1000);
					
				}
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testMethod() {
		
		try {
		
			synchronized (lock) {
				
				System.out.println(Thread.currentThread().getName() + " begin" + System.currentTimeMillis());
				lock = "456";
				
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + " end" + System.currentTimeMillis());
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
