package com.cdc.service.test.thread;

public class StaticThreadB extends Thread {
	
	private StaticService staticService;
	
	public StaticThreadB(StaticService staticService) {
		super();
		this.staticService = staticService;
	}
	
	@Override
	public void run() {
		staticService.printB();
	}

}
