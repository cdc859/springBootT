package com.cdc.service.test.thread;

public class WaitListThread2 extends Thread {
	
	private Object object;
	
	public WaitListThread2(Object object) {
		this.object = object;
	}
	
	public void run() {
		
		try {
			
			synchronized (object) {
				
				for (int i = 0; i < 5; i++) {
					
					System.out.println("WaitList.getListSize()=" + WaitList.getListSize());
					WaitList.addList();
					
					if (WaitList.getListSize() == 5) {
						
						object.notify();
						System.out.println("已经发出等待唤醒通知了！" );
						
					}
					
					System.out.println("添加了" + (i + 1) + "个元素。");
					
					Thread.sleep(1000);
					
				}
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
