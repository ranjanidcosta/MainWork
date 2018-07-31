package com.ranjani;

import java.util.ArrayList;


public class GenericClass {

	public static void main(String[] args) {

		ArrayList<String> array = new ArrayList<String>();
		array.add("animal");
		array.add("bird");
		array.add("fish");
		String getAnimal = array.get(0);
		System.out.println(getAnimal);

		
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("One");
		numbers.add("Two");
		showInfo(numbers);
	}

	private static void showInfo(ArrayList<String> list) {
		for (String value: list) {
			System.out.println(value);
		}
	}

	
	
}
