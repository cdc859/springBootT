package com.cdc.service.test.thread;

public class ConditionThread extends Thread {
	
	private ConditiconService conditiconService;
	
	public ConditionThread(ConditiconService conditiconService) {
		this.conditiconService = conditiconService;
	}
	
	public void run() {
		conditiconService.await();
	}

}
