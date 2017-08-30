package com.cdc.service.test.thread;

public class LoginServlet {
	
	private static String loginNameRef;
	private static String loginPasswordRef;
	
	synchronized public static void doPost(String loginName, String loginPassword) {
	
		try {
			
			loginNameRef = loginName;
			
			if ("a".equals(loginName)) {
					Thread.sleep(5000);
			}
			
			loginPasswordRef = loginPassword;
			
			System.out.println("loginName=" + loginNameRef + ",loginPassword=" + loginPasswordRef);
		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
