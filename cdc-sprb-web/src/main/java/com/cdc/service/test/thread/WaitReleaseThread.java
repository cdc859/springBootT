package com.cdc.service.test.thread;

public class WaitReleaseThread extends Thread {
	
	private Object ob;
	
	public WaitReleaseThread(Object ob) {
		this.ob = ob;
	}
	
	public void run() {
		
		WaitReleaseService wrs = new WaitReleaseService();
		wrs.testWaitRelease(ob);
		
	}

}
