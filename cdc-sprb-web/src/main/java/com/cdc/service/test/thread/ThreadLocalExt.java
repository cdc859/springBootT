package com.cdc.service.test.thread;

public class ThreadLocalExt<Object> extends ThreadLocal<Object> {
	
	@Override
	protected Object initialValue() {
		return (Object) "我是初始化的值。";
	}

}
