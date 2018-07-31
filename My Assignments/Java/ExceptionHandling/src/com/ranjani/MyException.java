package com.ranjani;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter numerator: ");
			int numerator = scan.nextInt();
			System.out.println("Enter denominator: ");
			int denominator = scan.nextInt();
			int quotient = divide(numerator, denominator);
			System.out.println("Quotient: " + quotient);
		} catch (ArithmeticException e) {
			System.out.println("Denominator cannot be zero");
		}
		catch (InputMismatchException e) {
			System.out.println("Enter numbers!");
		}
		finally {
			System.out.println("End of program");
		}
	}

	private static int divide(int numerator, int denominator) {

		return numerator / denominator;
	}

}
