package com.ranjani;

public class GenericMethodTest {

	public static void main(String... args) {
		GenericMethodTest g = new GenericMethodTest();
		Integer[] intArray = {1,2,3,4};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'a','b','c','d'};
		intArray[2] = 8;
		g.print(intArray);		
		System.out.println();
		g.print(doubleArray);
		System.out.println();
		g.print(charArray);
		System.out.println(g.sum(1,2,3,4,5));
		System.out.println(g.sum(23,45,12));
		System.out.println(g.sum(new Integer[] {23,45,12,50,5,7}));
	}
	public int sum(Integer... numbers) { // vararg
		int sum = 0;
		for (Integer val : numbers) {
			sum+=val;
		}
		return sum;
		
	}
	// Generic method <> is called a diamond, E can be any object
	public <E> void print(E[] inputArray) {
		for (E e : inputArray) {
			System.out.print(e);
		}
	}
	/*private void print(Character[] charArray) {
		for (Character val : charArray) {
			System.out.print(val);
		}		
	}

	private void print(Double[] doubleArray) {
		for (Double val : doubleArray) {
			System.out.print(val);
		}		
	}

	private void print(Integer[] intArray) {
		for (Integer val : intArray) {
			System.out.print(val);
		}		
	}*/

}
