package com.cdc.service.test.thread;

public class PrintString {
	
	private boolean isContinutePrint = true;

	public boolean isContinutePrint() {
		return isContinutePrint;
	}

	public void setContinutePrint(boolean isContinutePrint) {
		this.isContinutePrint = isContinutePrint;
	}
	
	public void printStringMethod() {
		
		try {
		
			while (isContinutePrint) {
				
				System.out.println("runing PrintString printStringMethod thread name=" + Thread.currentThread().getName());
				Thread.sleep(1000);
				
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
