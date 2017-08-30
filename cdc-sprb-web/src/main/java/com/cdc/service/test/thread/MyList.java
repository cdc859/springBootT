package com.cdc.service.test.thread;

import java.util.ArrayList;
import java.util.List;

public class MyList {
	
	//不加volatile由于老问题无法通讯，
	volatile private List<String> list = new ArrayList<String>();
	
	public void addList() {
		list.add("cdc");
	}
	
	public int getListSize() {
		return list.size();
	}

}
