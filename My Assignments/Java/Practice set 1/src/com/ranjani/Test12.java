package com.ranjani;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {
		System.out.println("Enter 3 numbers: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		scan = new Scanner(System.in);
		int num2 = scan.nextInt();
		scan = new Scanner(System.in);
		int num3 = scan.nextInt();
		double avg = (num1 + num2 + num3) / 3;
		System.out.println("Average of the 3 numbers is: " + avg);
	}
}
