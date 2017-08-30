package com.cdc.service.test.thread;

public class RunThread extends Thread {

	//volatile 强制从公共堆栈中取值,当成员变量发生变化时，强迫线程将变化值回写到共享内存
	private boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	public void run() {
		
		System.out.println("进入了run 了");
		int i = 0;
		while (isRunning) {
			//System.out.println("runing RunThread run thread name=" + Thread.currentThread().getName() + (i++));
		}
		
		System.out.println("线程被停止了 了");
		
	}
	
}
