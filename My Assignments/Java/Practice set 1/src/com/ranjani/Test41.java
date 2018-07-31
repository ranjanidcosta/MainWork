package com.ranjani;

import java.util.Scanner;

public class Test41 {

	public static void main(String[] args) {
		System.out.println("Enter the letter: ");
		Scanner scan = new Scanner(System.in);
		char a = scan.next().charAt(0);
		int b = (int) a;
		System.out.println("ASCII value of " + a + " is " + b);
	}

}
