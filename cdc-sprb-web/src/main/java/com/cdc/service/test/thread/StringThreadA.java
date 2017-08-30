package com.cdc.service.test.thread;

public class StringThreadA extends Thread {
	
	private StringService stringService;
	
	public StringThreadA(StringService stringService) {
		super();
		this.stringService = stringService;
	}
	
	@Override
	public void run() {
		stringService.print("AA");
	}

}
