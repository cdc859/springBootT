package com.cdc.service.test.thread;

import java.io.PipedInputStream;

public class ReadThread extends Thread {
	
	private ReadData rd;
	private PipedInputStream input;
	
	public ReadThread(ReadData rd, PipedInputStream input) {
		
		this.rd = rd;
		this.input = input;
		
	}
	
	public void run() {
		
		rd.readMethoth(input);
		
	}

}
