package com.ranjani;

public class Consumer implements Runnable {
	SharedInterface so;
	public Consumer(SharedInterface so) {
		this.so=so;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			so.getData();
		}
		
	}

}
