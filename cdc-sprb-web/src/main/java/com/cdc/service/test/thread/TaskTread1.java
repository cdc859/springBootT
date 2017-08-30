package com.cdc.service.test.thread;

public class TaskTread1 extends Thread {
	
	private Task task;
	
	public TaskTread1(Task task) {
		super();
		this.task = task;
	}

	public void run() {
		
		super.run();
		task.doLongTimeTask();
		
	}
}
