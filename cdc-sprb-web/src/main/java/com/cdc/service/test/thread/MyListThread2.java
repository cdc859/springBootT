package com.cdc.service.test.thread;

public class MyListThread2 extends Thread {
	
	private MyList myList;
	
	public MyListThread2(MyList myList) {
		super();
		this.myList = myList;
	}
	
	public void run() {
		
		try {
		
			while(true) {
				
				//System.out.println("myList.getListSize()=" + myList.getListSize());
				
				//Thread.sleep(1000);
				
				if(myList.getListSize() == 5) {
					System.out.println("==5了线程B要退出了");
					throw new InterruptedException();
				}
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
