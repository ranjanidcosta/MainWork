package com.ranjani;

import java.util.Scanner;

public class Test44 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum1, sum2 = 0;
		sum1 = num * 11;
		sum2 = num * 111;
		int value = 0;
		value = num + sum1 + sum2;
		System.out.println("Sum of " + num + " + " + sum1 + " + " + sum2 + " is " + value);
	}

}
