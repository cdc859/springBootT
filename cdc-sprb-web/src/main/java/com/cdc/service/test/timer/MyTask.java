package com.cdc.service.test.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	@Override
	public void run() {
		
		
		try {
			System.out.println("MyTask1 运行了！start 时间为：" + new Date().toLocaleString());
			Thread.sleep(20000);
			System.out.println("MyTask1 运行了！ end 时间为：" + new Date().toLocaleString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
