package com.cdc.service.test.thread;

public class StringThreadD extends Thread {
	
	private StringService stringService;
	
	public StringThreadD(StringService stringService) {
		super();
		this.stringService = stringService;
	}
	
	@Override
	public void run() {
		stringService.testMethod();
	}

}
