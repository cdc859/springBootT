package com.cdc.service.test.thread;

public class ConditionThreadD extends Thread {
	
	private ConditiconService conditiconService;
	
	public ConditionThreadD(ConditiconService conditiconService) {
		this.conditiconService = conditiconService;
	}
	
	public void run() {
		conditiconService.awaitD();
	}

}
