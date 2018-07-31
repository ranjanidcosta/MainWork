package com.ranjani;

public class StringTest {
	
	public StringTest() {
		String str1 = "Blr is crowded";
		System.out.println(str1);
		modify(str1);
		System.out.println("after modify " + str1);
		StringBuffer sb = new StringBuffer(str1);
		modify(sb);
		System.out.println("sb= " + sb);
	}
	private void modify(StringBuffer sb) {
		sb.append(" city");		
	}
	private void modify(String str1) {
		str1 = str1.concat(" city");
		System.out.println("here str1=" + str1);		
	}

	public static void main(String[] args) {
		new StringTest();

	}

}
