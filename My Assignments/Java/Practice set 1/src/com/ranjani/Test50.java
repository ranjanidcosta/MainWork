package com.ranjani;

public class Test50 {

	public static void main(String[] args) {
		System.out.println("Numbers divisble by 3 ");
		for (int i = 0; i < 101; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Numbers divisble by 5 ");
		for (int i = 0; i < 101; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		System.out.println("Numbers divisble by 3 and 5 ");
		for (int i = 0; i < 101; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println(i);
			}
		}
	}

}
