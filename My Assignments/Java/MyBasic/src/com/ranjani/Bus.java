package com.ranjani;

public class Bus extends Vehicle implements Movable{

	@Override
	public void move() {
		System.out.println("bus is moving");
	}

}
