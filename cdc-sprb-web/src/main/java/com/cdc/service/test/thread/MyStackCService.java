package com.cdc.service.test.thread;

public class MyStackCService {
	
	private MyStack myStack;
	
	public MyStackCService(MyStack myStack) {
		super();
		this.myStack = myStack;
	}
	
	public void popService() {
		
		myStack.pop();
		
	}

}
