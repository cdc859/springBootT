package com.cdc.service.test.innerClass;

import com.cdc.service.test.innerClass.PublicClass.PrivateClass;
import com.cdc.service.test.innerClass.StaticPublicClass.StaticPrivateClass;

public class Test {

	public static void main(String[] args) {
		
		testInner1();
		//testInner();

	}
	
	/**
	 * 静态内部类
	 */
	public static void testInner1() {
		
		StaticPublicClass pc = new StaticPublicClass();
		pc.setPassWord("111");
		pc.setUserName("us1");
		
		System.out.println(pc.getUserName() + "," + pc.getPassWord());
		
		StaticPrivateClass pcIn = new StaticPrivateClass();
		pcIn.setAddress("dddd");
		pcIn.setAge("18");
		System.out.println(pcIn.getAddress() + "," + pcIn.getAge());
		
	}

	/**
	 * 内部类
	 */
	public static void testInner() {
		
		PublicClass pc = new PublicClass();
		pc.setPassWord("111");
		pc.setUserName("us1");
		
		System.out.println(pc.getUserName() + "," + pc.getPassWord());
		
		PrivateClass pcIn = pc.new PrivateClass();
		pcIn.setAddress("dddd");
		pcIn.setAge("18");
		System.out.println(pcIn.getAddress() + "," + pcIn.getAge());
		
	}
}
