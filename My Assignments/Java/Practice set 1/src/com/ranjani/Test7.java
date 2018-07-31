package com.ranjani;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int product = 0;
		for (int i = 1; i < 11; i++) {
			product = number * i;
			System.out.println(number + " * " + i + " = " + product);
		}
		 double num = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		 System.out.println(num);

	}

}
