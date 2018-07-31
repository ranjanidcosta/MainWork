package com.ranjani;

public class ExampleDataTypes {

//	public static void main(String[] args) {
//        int x;
//	        x = 10;
//        if(x == 10){
//	        int y = 20;
//	        System.out.print("x and y: "+ x + " " + y);
//	        y = x*2;
//        }
//        //y = 100;
//      //  System.out.print("x and y: " + x + " " + y);
//    }

	public static void main(String[] args) {
		byte b;
	        int i = 258;
        double d = 325.59;

        b = (byte) i;
        System.out.println(b);

        i = (int) d;
        System.out.println(i);

            b = (byte) d;
            System.out.println(b);
	}
}