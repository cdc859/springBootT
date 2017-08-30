package com.cdc.service.test.thread;

public class ConditionThreadC extends Thread {
	
	private ConditiconService conditiconService;
	
	public ConditionThreadC(ConditiconService conditiconService) {
		this.conditiconService = conditiconService;
	}
	
	public void run() {
		conditiconService.awaitC();
	}

}
