package com.ranjani;

import java.util.Scanner;

public class Examples {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers: <one> <two>");
		int one = scan.nextInt();
		int two = scan.nextInt();
		Sum ob=new Sum();
		int a=ob.add(one,two);
		System.out.println(one +" + "+ two +" = "+a);
		
	}

}
