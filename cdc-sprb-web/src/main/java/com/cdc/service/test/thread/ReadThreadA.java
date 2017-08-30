package com.cdc.service.test.thread;

public class ReadThreadA extends Thread {
	
	private ReadAndWriteService raws;
	
	public ReadThreadA(ReadAndWriteService raws) {
		this.raws = raws;
	}
	
	public void run() {
		raws.read();
	}

}
