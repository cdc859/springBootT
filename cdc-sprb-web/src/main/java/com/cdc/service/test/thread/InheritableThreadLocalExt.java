package com.cdc.service.test.thread;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal<Object> {
	
	@Override
	protected Object initialValue() {
		Object ob = new Date().getTime();
		return ob;
	}
	
	@Override
	protected Object childValue(Object parentValue) {
		return parentValue + "我在子线程加的值";
	}

}
