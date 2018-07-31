package com.ranjani;

import java.util.Scanner;

public class Traveller {

	public Traveller() {
		Car c = new Car();
		c.setTyres(5);
		System.out.println("tyres= " + c.getTyres());
		c.move();		
		Vehicle b = new Bus();
		b.setType("Volvo");
		System.out.println("bus type=" + b.getType());
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter vehicle type: ");
		new MovableFactory();
		Movable m = MovableFactory.getInstance(scan.next());
		m.move();
	}

	public static void main(String[] args) {
		new Traveller();
	}

}
