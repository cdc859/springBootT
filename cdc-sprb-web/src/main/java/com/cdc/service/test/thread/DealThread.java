package com.cdc.service.test.thread;

public class DealThread implements Runnable {
	
	private String userName;
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void run() {
		
		if ("a".equals(userName)) {
			
			synchronized (lock1) {
				
				try {
					
					System.out.println("userName=" + userName);
					Thread.sleep(3000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (lock2) {
					System.out.println("按 lock1 到 lock2 执行。");
				}
				
			}
			
		}
		
		if ("b".equals(userName)) {
			
			synchronized (lock2) {
				
				try {
					
					System.out.println("userName=" + userName);
					Thread.sleep(3000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (lock1) {
					System.out.println("按 lock2 到 lock1 执行。");
				}
				
			}
			
		}

	}

}
