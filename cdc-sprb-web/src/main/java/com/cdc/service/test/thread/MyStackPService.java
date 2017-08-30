package com.cdc.service.test.thread;

public class MyStackPService {
	
	private MyStack myStack;
	
	public MyStackPService(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	
	public void pushService() {
		
		myStack.push();
		
	}

}
