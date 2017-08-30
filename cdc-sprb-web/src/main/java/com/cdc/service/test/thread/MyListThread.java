package com.cdc.service.test.thread;

public class MyListThread extends Thread {
	
	private MyList myList;
	
	public MyListThread(MyList myList) {
		super();
		this.myList = myList;
	}
	
	public void run() {
		
		try {
		
			for (int i = 0; i < 10; i++) {
				
				myList.addList();
				
				System.out.println("添加了" + (i + 1) + "个元素");
				
				Thread.sleep(1000);
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
