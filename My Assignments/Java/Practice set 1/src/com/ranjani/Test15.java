package com.ranjani;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		System.out.println("Enter 2 numbers: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		scan = new Scanner(System.in);
		int num2 = scan.nextInt();
		int op = swap(num1, num2);
		System.out.println("Swapped output: " + op + " , " + num1);

	}

	private static  int swap(int a, int b) {
		return b;

	}
}
