package com.cdc.service.test.thread;

public class WaitReleaseThread2 extends Thread {
	
	private Object ob;
	
	public WaitReleaseThread2(Object ob) {
		this.ob = ob;
	}
	
	public void run() {
		
		WaitReleaseService wrs = new WaitReleaseService();
		wrs.testWaitRelease(ob);
		
	}

}
