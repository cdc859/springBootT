package com.cdc.service.test.timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class Test {

	public static void main(String[] args) throws ParseException, InterruptedException {
		
		//test1();
		
		//test2();
		
		//test3();
		
		//test4();
		
		//test5();
		
		//test6();
		
		test7();

	}
	
	/**
	 * timer.schedule(mt, date, 2000);在不延时的情况下是根据上一次任务的开始时间加上指定的延时时间来算在执行
	 * timer.scheduleAtFixedRate(mt, date, 3000);在不延时的情况下是根据上一次任务的结束执行
	 * 在延时情况下两种都是在上一次任务解释时间开始执行
	 * @throws ParseException
	 */
	public static void test7() throws ParseException {
		
		int i = 0;
			
		Timer timer = new Timer();
		MyTask3 mt = new MyTask3(i);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = "2017-07-28 15:49:30";
		
		Date date = sdf.parse(dateString);
		
		//timer.schedule(mt, date, 2000);
		timer.scheduleAtFixedRate(mt, date, 3000);
		
	}
	
	/**
	 * timer.schedule(mt, 3000);与执行任务的当前时间为参考，延迟指定毫秒时间在执行
	 * timer.schedule(mt, 3000, 1000);与执行任务的当前时间为参考，延迟指定毫秒时间在执行,在指定相隔毫秒时间后无线循环执行
	 * @throws ParseException
	 */
	public static void test6() throws ParseException {
		
		Timer timer = new Timer();
		
		MyTask3 mt = new MyTask3(1);
		
		System.out.println("当前时间:" + new Date().toLocaleString());
		
		//timer.schedule(mt, 3000);
		
		timer.schedule(mt, 3000, 1000);
		
	}
	
	/**
	 * 注意Timer.cancel()的使用，有时候Timer.cancel()可能没有争抢到锁，任务会继续执行
	 * @throws ParseException
	 */
	public static void test5() throws ParseException {
		
		int i = 0;
		
		while (true) {
			
			Timer timer = new Timer();
			i++;
			MyTask3 mt = new MyTask3(i);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String dateString = "2017-07-28 15:49:30";
			
			Date date = sdf.parse(dateString);
			
			timer.schedule(mt, date, 2000);
			timer.cancel();
			
		}
		
	}
	
	/**
	 * schedule(mt, date, 3000)指定相隔时间无限循环执行,如果计划早于当前时间会立即执行,且此方法不具有追赶信，他会与执行时间继续循环执行
	 * scheduleAtFixedRate(mt, date, 3000)指定相隔时间无限循环执行,如果计划早于当前时间会立即执行,且此方法具有追赶信，他会补充执行指定相隔时间循环的次数
	 * 如果任务执行很久还是会按照延时时间一个一个继续循环执行
	 * Task.cancel()将自己从任务队列中清除不在执行
	 * Timer.cancel()将全部任务清楚，同事结束进程
	 * @throws ParseException
	 * @throws InterruptedException 
	 */
	public static void test4() throws ParseException, InterruptedException {
		
		Timer timer = new Timer();
		
		MyTask2 mt = new MyTask2();
		//MyTask mt = new MyTask();//测试任务延时执行情况
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = "2017-07-28 17:03:30";
		
		Date date = sdf.parse(dateString);
		
		System.out.println("字符串时间:" + dateString + "当前时间:" + new Date().toLocaleString());
		
		timer.schedule(mt, date, 2000);
		//timer.scheduleAtFixedRate(mt, date, 2000);
		
		Thread.sleep(6000);
		timer.cancel();
		System.out.println("timer is over!");
		
	}
	
	/**
	 * 多个task时候，有可能前面的task运行的时间过久会导致后面的task任务延时执行的情况，这样原因产生的原因是因为多个task是放入队列一个一个按照顺序执行的
	 * @throws ParseException
	 */
	public static void test3() throws ParseException {
		
		Timer timer = new Timer();
		
		MyTask mt = new MyTask();
		MyTask2 mt2 = new MyTask2();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = "2017-07-28 15:42:30";
		String dateString2 = "2017-07-28 15:42:32";
		
		Date date = sdf.parse(dateString);
		Date date2 = sdf.parse(dateString2);
		
		System.out.println("字符串时间:" + dateString + "当前时间:" + new Date().toLocaleString());
		
		timer.schedule(mt, date);
		timer.schedule(mt2, date2);
		
	}
	
	/**
	 * 执行一个指定未来时间执行的任务，但是注意此timer(true)会执行会创建一个线程，因为是守护线程，所以会立即结束，连task的任务都没有执行
	 * @throws ParseException
	 */
	public static void test2() throws ParseException {
		
		Timer timer = new Timer(true);
		
		MyTask mt = new MyTask();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = "2017-07-28 15:04:30";
		
		Date date = sdf.parse(dateString);
		
		System.out.println("字符串时间:" + dateString + "当前时间:" + new Date().toLocaleString());
		
		timer.schedule(mt, date);
		
	}
	
	/**
	 * 执行一个指定未来时间执行的任务，但是注意此timer()会执行会创建一个线程，因为不是守护线程，所以并没有结束一直在运行中
	 * 注意如果指定的时间早于当前时间，则会立即执行task
	 * @throws ParseException
	 */
	public static void test1() throws ParseException {
		
		Timer timer = new Timer();
		
		MyTask mt = new MyTask();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = "2017-07-28 14:56:30";
		
		Date date = sdf.parse(dateString);
		
		System.out.println("字符串时间:" + dateString + "当前时间:" + new Date().toLocaleString());
		
		timer.schedule(mt, date);
		
	}

}
