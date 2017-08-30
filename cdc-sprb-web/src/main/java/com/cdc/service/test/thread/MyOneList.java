package com.cdc.service.test.thread;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

	private List<String> list = new ArrayList<String>(); 
	
	synchronized public void add(String data) {
		list.add(data);
	}
	
	synchronized public int getSize() {
		return list.size();
	}
}
