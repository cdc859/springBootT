package com.cdc.service.test.thread;

public class ConditionThreadA extends Thread {
	
	private ConditiconService conditiconService;
	
	public ConditionThreadA(ConditiconService conditiconService) {
		this.conditiconService = conditiconService;
	}
	
	public void run() {
		conditiconService.awaitA();
	}

}
