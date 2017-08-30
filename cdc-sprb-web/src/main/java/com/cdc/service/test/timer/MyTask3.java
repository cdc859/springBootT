package com.cdc.service.test.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask3 extends TimerTask {
	
	static int i;
	
	public MyTask3(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		
		try {
			
			System.out.println("正常执行了：" + i);
			
			System.out.println("MyTask3 运行了！start 时间为：" + new Date().toLocaleString());
			
			Thread.sleep(1000);
			
			
			System.out.println("MyTask3 运行了！ end 时间为：" + new Date().toLocaleString());
			i++;
			
			if (5 == i) {
				this.cancel();//将自己从任务队列中清除不在执行
			}
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
