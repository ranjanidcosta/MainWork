package com.ranjani;

public class MyThreadTest extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("run" + i);
		}
	}
	public static void main(String[] args) {
		MyThreadTest thread = new MyThreadTest();
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main" + i);
		}
	}

}
