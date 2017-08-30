package com.cdc.service.test.thread;

import java.io.PipedOutputStream;

public class WriteThread extends Thread {
	
	private WriteData wd;
	private PipedOutputStream out;
	
	public WriteThread(WriteData wd, PipedOutputStream out) {
		
		this.wd = wd;
		this.out = out;
		
	}
	
	public void run() {
		
		wd.writeMethoth(out);
		
	}

}
