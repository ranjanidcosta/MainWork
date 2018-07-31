package com.ranjani;

public class SyncTest {

	public static void main(String[] args) {
		SyncTest sync = new SyncTest();
	}	

	public SyncTest() {
		SharedInterface so = new SharedObject();
		Producer prod = new Producer(so);
		Consumer consume = new Consumer(so);
		Thread t1 = new Thread(prod);
		t1.start();
		try {Thread.sleep(2);} catch (InterruptedException e) {}
		Thread t2 = new Thread(consume);
		t2.start();
	}

}
