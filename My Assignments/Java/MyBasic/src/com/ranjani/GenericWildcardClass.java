package com.ranjani;

import java.util.ArrayList;

class TV{

	@Override
	public String toString() {
		return "I am a TV";
	}
	
	public void start() {
		System.out.println("TV is on");
	}
}

class Remote extends TV{
	@Override
	public String toString() {
		return "I am a Remote";
	}	
	
	public void click() {
		System.out.println("Clicked a button");
	}
}

public class GenericWildcardClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<TV> list = new ArrayList<TV>();
		list.add(new TV());
		list.add(new TV());
//		list.add("One");
//		list.add("Two");
		showInfo(list);
		
		ArrayList<Remote> list1 = new ArrayList<Remote>();
		list1.add(new Remote());
		list1.add(new Remote());
//		list.add("One");
//		list.add("Two");
		showInfo(list1);	
//		showInfo1(list);
	}

	private static void showInfo(ArrayList<? extends TV> list) {
		for (TV value: list) {
			System.out.println(value);
			value.start();
		}
		
	}
	private static void showInfo1(ArrayList<? super Camera> list) {
		for (Object value: list) {
			System.out.println(value);
//			value.start();
		}
		
	}
}
