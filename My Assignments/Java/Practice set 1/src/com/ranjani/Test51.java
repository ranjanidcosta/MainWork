package com.ranjani;

import java.util.Scanner;

public class Test51 {
public static void main(String[] args) {
	System.out.println("Enter a number: ");
	Scanner scan = new Scanner(System.in);
	String str = scan.nextLine();
	int result = Integer.parseInt(str);
	System.out.printf("The integer value is %d: ",result);
}
}
