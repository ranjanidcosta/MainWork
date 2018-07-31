package com.ranjani;

import java.util.Scanner;

public class Test38 {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		char[] str = scan.nextLine().toCharArray();
		int spaces = 0;
		int characters = 0;
		int number = 0;
		int none =0;
		for (int i = 0; i < str.length; i++) {
			 if (((str[i] >=65)&&(str[i]<=90))||((str[i]>=97)&&(str[i]<=122)))
					 characters++;
					 else if (str[i]==32)
					 spaces++;
					 else if ((str[i]>='0')&&(str[i]<='9'))
					 number++;
					 else
					 none++;
		}
		System.out.println("Letter: " + characters);
		System.out.println("Spaces: " + spaces);
		System.out.println("Number: " + number);
		System.out.println("Character: " + none);
		
	}

}
