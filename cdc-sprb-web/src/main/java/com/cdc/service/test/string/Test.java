package com.cdc.service.test.string;

public class Test {

	public static void main(String[] args) {
		
		testString();
		
	}
	
	/**
	 * 由于jvm的String常量池的原因，注意string的各种赋值结果
	 */
	public static void testString() {
		
		String s1 = "sss111";
		String s2 = "sss111";
		System.out.println(s1 == s2); 
		
		String s3 = new String("1");
	    s3.intern();
	    String s4 = "1";
	    System.out.println(s3 == s4);

	    String s5 = new String("1") + new String("1");
	    s5.intern();
	    String s6 = "11";
	    System.out.println(s5 == s6);
	    
	    String s7 = new String("sss111");
	    String s8 = "sss111";
	    System.out.println(s7 == s8);
	    
	    String s11 = new String("111");
	    String s22 = "sss111";
	    String s33 = "sss" + "111";
	    String s44 = "sss" + s11;
	    System.out.println(s22 == s33); 
	    System.out.println(s22 == s44);
	    System.out.println(s22 == s44.intern());
	    
	    String s31 = new String("1");
	    s31 = s31.intern();
	    String s41 = "1";
	    System.out.println(s31 == s41);
		
	}
	
}
