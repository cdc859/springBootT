package com.cdc.service.test.thread;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
	
	private List<String> list = new ArrayList<String>();
	
	synchronized public void push () {
		
		try {
			
			//if (list.size() == 1) {
			while (list.size() == 1) {
				
				//System.out.println("push 操作中，由于size等于1， " + Thread.currentThread().getName() + "线程呈 wait状态.");
				this.wait();
				
			}
			
			list.add("anyString" + Math.random());
			//this.notify();
			this.notifyAll();
			
			System.out.println("push=" + list.size());
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	synchronized public String pop () {
		
		String returnValue = "";
		
		try {
			
			//if (list.size() == 0) {
			while (list.size() == 0) {
				
				System.out.println("pop 操作中，由于size等于1， " + Thread.currentThread().getName() + "线程呈 wait状态.");
				this.wait();
				
			}
			
			returnValue = ""  + list.get(0);
			list.remove(0);
			//this.notify();
			this.notifyAll();
			
			System.out.println("pop=" + list.size());
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return returnValue;
		
	}

}
