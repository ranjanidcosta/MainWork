package com.ranjani;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IDvalidator {

	Pattern pattern;
	Matcher matcher;
	String regex = "^(\\d{3}-\\d{2}-\\d{4})$";
	public IDvalidator() {
		pattern = Pattern.compile(regex);
		
	}

	public boolean validate(String id) {
		boolean valid = false;
		matcher = pattern.matcher(id);
		valid = matcher.matches();
		return valid;
	}
	public static void main(String[] args) {
		IDvalidator idv = new IDvalidator();
		Scanner scan = new Scanner(System.in);
		while (true) {
		System.out.println("Enter ID <ctrl+Z for stopping>");
		boolean valid = idv.validate(scan.nextLine());
		System.out.println("The ID is: " + valid);
		}
	}

}
