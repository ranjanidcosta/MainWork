package com.ranjani;

import java.util.Scanner;

public class Test53 {

	public static void main(String[] args) {
		System.out.println("Enter 3 numbers: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		scan = new Scanner(System.in);
		int num2 = scan.nextInt();
		scan = new Scanner(System.in);
		int num3 = scan.nextInt();

		int result = largest(num1, num2, num3);
		System.out.println("Result: " + result);

	}

	private static int largest(int num1, int num2, int num3) {
		int a = 0;
		int b = 0;
		int c = 0;

		a = num1;
		b = num2;
		c = num3;
		int num = 0;
		if (a > b) {
			if (a > c) {
				num = a;
			}
		} else if (b > c) {
			num = b;
		} else
			num = c;

		return num;
	}
}
