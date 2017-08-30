package com.cdc.service.test.thread;

public class WaitReleaseService {
	
	public void testWaitRelease(Object ob) {
		
		try {
			
			synchronized (ob) {
				
				System.out.println("thread name=" + Thread.currentThread().getName() + " begin wait");
				
				ob.wait();//会释放锁
				//Thread.sleep(40000);//不会释放锁
				
				System.out.println("thread name=" + Thread.currentThread().getName() + " end weit");
				
			}
		
		} catch (InterruptedException e) {
			System.out.println("thread name=" + Thread.currentThread().getName() + "出现了异常，因为wait状态被interrupted了");
			e.printStackTrace();
		}
		
	}

}
