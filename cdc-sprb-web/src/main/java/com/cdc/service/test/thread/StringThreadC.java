package com.cdc.service.test.thread;

public class StringThreadC extends Thread {
	
	private StringService stringService;
	
	public StringThreadC(StringService stringService) {
		super();
		this.stringService = stringService;
	}
	
	@Override
	public void run() {
		stringService.testMethod();
	}

}
