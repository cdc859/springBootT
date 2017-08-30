package com.cdc.service.test.thread;

public class TaskTread2 extends Thread {
	
	private Task task;
	
	public TaskTread2(Task task) {
		super();
		this.task = task;
	}

	public void run() {
		
		super.run();
		task.doLongTimeTask();
		
	}
}
