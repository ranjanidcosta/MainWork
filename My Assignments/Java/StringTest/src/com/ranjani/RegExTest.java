package com.ranjani;

import java.util.Scanner;

public class RegExTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 6 digit number");
		String input = scan.nextLine();
		boolean valid = input.matches("\\d{6}");
		System.out.println("The number is valid: " + valid);
		// for ID 333-22-4444
		System.out.println("Enter an ID");
		input = scan.nextLine();
		valid = input.matches("\\d{3}-\\d{2}-\\d{4}");
		System.out.println("ID is valid: " + valid);
		System.out.println("Enter name");
		input = scan.nextLine();
		valid = input.matches("[A-Z][A-Za-z]{3,}");
		System.out.println("Name is valid: " + valid);
		// String matches() uses Matcher and Pattern
	}

}
