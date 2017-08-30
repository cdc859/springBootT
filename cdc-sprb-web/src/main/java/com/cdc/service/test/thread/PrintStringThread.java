package com.cdc.service.test.thread;

public class PrintStringThread extends Thread {
	
	private boolean isContinutePrint = true;

	public boolean isContinutePrint() {
		return isContinutePrint;
	}

	public void setContinutePrint(boolean isContinutePrint) {
		this.isContinutePrint = isContinutePrint;
	}
	
	public void printStringMethod() {
		
		//try {
			int i = 0;
			while (isContinutePrint) {
				
				//System.out.println("runing times " + (i++) + " PrintString printStringMethod thread name=" + Thread.currentThread().getName());
				//Thread.sleep(10);
				i ++;
				//if (i == 10) {
					//isContinutePrint = false;
					//System.out.println("ttt-"+ Thread.currentThread().getName() + "-i:" + i);
				//}
				//System.out.println(System.currentTimeMillis());
				if (i == 1000) {
					//isContinutePrint = false;
					System.out.println(System.currentTimeMillis() + "ttt-"+ Thread.currentThread().getName() + "-i:" + i);
				}
			}
			
			System.out.println( System.currentTimeMillis() +  "  times " + (i++) + "  PrintString printStringMethod 我已经被停止了" + isContinutePrint + Thread.currentThread().getName());
		
		/*} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	public void run() {
		
		printStringMethod();
		
	}

}
