package com.cdc.service.test.thread;

public class WriteThreadB extends Thread {
	
	private ReadAndWriteService raws;
	
	public WriteThreadB(ReadAndWriteService raws) {
		this.raws = raws;
	}
	
	public void run() {
		raws.write();
	}

}
