package com.ranjani;

public class ExampleCasting {
	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();

		machine1.start();
		camera1.start();
		camera1.snap();

		Machine machine2 = camera1;
		machine2.start();

		Machine machine3 = new Camera();
		Camera camera2 = (Camera) machine3;
		camera2.start();
		camera2.snap();
		// Below throws run time exception
		// Machine machine4 = new Machine();
		// Camera camera3 = (Camera) machine4;
		// camera3.snap();
		// camera3.start();
	}
}
