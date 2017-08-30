package com.cdc.service.test.thread;

import java.util.ArrayList;
import java.util.List;

public class WaitList {
	
	private static List<String> list = new ArrayList<String>();
	
	public static void addList() {
		list.add("cdc");
	}
	
	public static int getListSize() {
		return list.size();
	}

}
