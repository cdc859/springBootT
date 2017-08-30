package com.cdc.service.test.thread;

public class MyService {
	
	public MyOneList addServiceMethod(MyOneList mol, String data) {
		
		try {
			
			//synchronized (mol) {//加上锁可以解决多线程问题
				
				if (mol.getSize() < 1) {//存在多线程问题
					
					Thread.sleep(2000);
					
					mol.add(data);
				}
				
			//}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mol;
		
	}

}
