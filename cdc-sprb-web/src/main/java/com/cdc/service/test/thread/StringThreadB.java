package com.cdc.service.test.thread;

public class StringThreadB extends Thread {
	
	private StringService stringService;
	
	public StringThreadB(StringService stringService) {
		super();
		this.stringService = stringService;
	}
	
	@Override
	public void run() {
		stringService.print("AA");
	}

}
