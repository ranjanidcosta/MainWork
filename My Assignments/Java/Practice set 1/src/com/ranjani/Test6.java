package com.ranjani;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		System.out.println("Enter the first number: ");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		scan = new Scanner(System.in);
		int num2 = scan.nextInt();
		
		int sum = num1 + num2;
		int diff = num1 - num2;
		int product = num1 * num2;
		int remainder = num1/num2;
		int quotient = num1%num2;
		System.out.println("Addition of the numbers " + num1 + " " + num2 + " is " + sum);
		System.out.println("Difference of the numbers " + num1 + " " + num2 + " is " + diff);
		System.out.println("Product of the numbers " + num1 + " " + num2 + " is " + product);
		System.out.println("Remainder of the numbers " + num1 + " " + num2 + " is " + remainder);
		System.out.println("Quotient of the numbers " + num1 + " " + num2 + " is " + quotient);
		

	}

}
