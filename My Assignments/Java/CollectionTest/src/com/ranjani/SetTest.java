package com.ranjani;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> colorSet = new HashSet<>();
		String[] colorArray = {"red","blue","red","yellow","green"};
		for (String color : colorArray) {
			System.out.println(colorSet.add(color));
		}
		System.out.println(colorSet);
		Iterator<String> iter = colorSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
