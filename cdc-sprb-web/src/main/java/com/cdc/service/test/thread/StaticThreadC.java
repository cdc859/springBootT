package com.cdc.service.test.thread;

public class StaticThreadC extends Thread {
	
	private StaticService staticService;
	
	public StaticThreadC(StaticService staticService) {
		super();
		this.staticService = staticService;
	}
	
	@Override
	public void run() {
		staticService.printC();
	}

}
