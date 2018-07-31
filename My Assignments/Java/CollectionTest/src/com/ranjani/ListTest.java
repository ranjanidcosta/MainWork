package com.ranjani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List<String> colorList = new ArrayList<>();
		String[] colorArray = {"red","green","blue"};
		for (String color : colorArray) {
			colorList.add(color);
		}
		System.out.println(colorList);
		colorList.add("pink");
		System.out.println(colorList);
		System.out.println(colorList.get(2));
		colorList.set(1, "yellow");
		System.out.println(colorList);
		Collections.sort(colorList,Collections.reverseOrder());
		System.out.println(colorList);
	}

}
