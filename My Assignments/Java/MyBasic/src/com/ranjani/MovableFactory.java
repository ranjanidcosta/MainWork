package com.ranjani;

public class MovableFactory {

	/**
	 * 
	 * @param type The type of vehicle in lower case
	 * @return An instance of a class implementing Movable
	 * @see Movable
	 * @author Ranjani
	 */
	public static Movable getInstance(String type) {
		if(type.equals("car")) {
			return new Car();
		}
		else if(type.equals("bus")) {
			return new Bus();
		}
		return null;
	}

}
