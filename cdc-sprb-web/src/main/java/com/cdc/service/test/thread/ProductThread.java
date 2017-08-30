package com.cdc.service.test.thread;

public class ProductThread extends Thread {
	
	private Product p;
	
	public ProductThread(Product p) {
		this.p = p;
	}
	
	public void run() {
		
		while(true) {
			p.productValue();
		}
		
	}

}
