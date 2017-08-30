package com.cdc.service.test.thread;

public class ConditionThreadB extends Thread {
	
	private ConditiconService conditiconService;
	
	public ConditionThreadB(ConditiconService conditiconService) {
		this.conditiconService = conditiconService;
	}
	
	public void run() {
		conditiconService.awaitB();
	}

}
