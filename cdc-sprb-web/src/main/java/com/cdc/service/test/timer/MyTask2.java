package com.cdc.service.test.timer;

import java.util.Date;
import java.util.TimerTask;

public class MyTask2 extends TimerTask {

	@Override
	public void run() {
		
		System.out.println("MyTask2 运行了！时间为：" + new Date().toLocaleString());
		//this.cancel();//将自己从任务队列中清除不在执行

	}

}
