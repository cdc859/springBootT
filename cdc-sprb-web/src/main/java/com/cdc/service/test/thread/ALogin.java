package com.cdc.service.test.thread;

public class ALogin extends Thread {
	
	public void run() {
		LoginServlet.doPost("a", "aa");
	}

}
