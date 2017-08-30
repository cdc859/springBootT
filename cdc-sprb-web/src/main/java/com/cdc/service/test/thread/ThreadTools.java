package com.cdc.service.test.thread;

public class ThreadTools {
	
	public static ThreadLocal<Object> tl = new ThreadLocal<Object>();
	
	public static InheritableThreadLocalExt itl = new InheritableThreadLocalExt();

}
