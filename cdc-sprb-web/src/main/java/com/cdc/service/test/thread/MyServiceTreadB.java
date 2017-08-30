package com.cdc.service.test.thread;

public class MyServiceTreadB extends Thread {
	
	private MyOneList myOneList;
	
	public MyServiceTreadB(MyOneList myOneList) {
		super();
		this.myOneList = myOneList;
	}

	public void run() {
		
		MyService ms = new MyService();
		ms.addServiceMethod(myOneList, "B");
		
	}
}
