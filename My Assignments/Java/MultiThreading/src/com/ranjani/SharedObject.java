package com.ranjani;

public class SharedObject implements SharedInterface {

	private int data;

	synchronized public int getData() {
		int temp = data;
		notify();
		System.out.println("   Get: "+ temp);
		try {wait(1000);} catch (InterruptedException e) {}
		return temp;		
	}

	synchronized public void setData(int data) {
		System.out.println("Set: "+ data);
		this.data = data;
		notify();
		try {wait(1000);} catch (InterruptedException e) {}
	}

}
