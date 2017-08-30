package com.cdc.service.test.thread;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicService {
	
	public AtomicLong acount = new AtomicLong();
	
	synchronized public void run() {//原子类在方法间调用要保持同步需要加上同步关键字
		
		System.out.println("thread name;" + Thread.currentThread().getName() + "加了一百后的值" + acount.addAndGet(100));
		acount.addAndGet(1);
	}

}
