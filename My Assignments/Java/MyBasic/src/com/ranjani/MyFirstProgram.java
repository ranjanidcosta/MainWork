package com.ranjani;

public class MyFirstProgram {
	
	public MyFirstProgram() {
		System.out.println("constr");
	}

	public static void main(String[] args) {
		System.out.println("Hello !!");
		MyFirstProgram mfp = new MyFirstProgram();
		mfp.print("Hi there");
	}

	public void print(String val) {
		System.out.println(val);
		
	}

}
