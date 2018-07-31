package com.ranjani;

import java.util.Scanner;

public class Test37 {
public static void main(String[] args) {
	String str = null;
	System.out.println("Enter a string");
	Scanner scan = new Scanner(System.in);
	str = scan.nextLine();
	StringBuffer sbf = new StringBuffer(str);
	StringBuffer reverse = sbf.reverse();
	System.out.println("Reversing the string: " + reverse);
	
}
}
