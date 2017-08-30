package com.cdc.service.test.thread;

public class StaticThreadA extends Thread {
	
	private StaticService staticService;
	
	public StaticThreadA(StaticService staticService) {
		super();
		this.staticService = staticService;
	}
	
	@Override
	public void run() {
		staticService.printA();
	}

}
