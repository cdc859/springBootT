package com.cdc.service.test.thread;

public class MyServiceTreadA extends Thread {
	
	private MyOneList myOneList;
	
	public MyServiceTreadA(MyOneList myOneList) {
		super();
		this.myOneList = myOneList;
	}

	public void run() {
		
		MyService ms = new MyService();
		ms.addServiceMethod(myOneList, "A");
		
	}
}
