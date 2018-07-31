package com.ranjani;

public class MyRunnableTest implements Runnable{
	public static void main(String[] args) {
		MyRunnableTest test = new MyRunnableTest();
		Thread t = new Thread(test);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main:" + i);
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("run" + i);
		}		
	}
}
