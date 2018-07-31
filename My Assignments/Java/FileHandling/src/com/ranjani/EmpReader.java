package com.ranjani;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpReader {

	public static void main(String[] args) {
		File f = new File("EmpOutput.ser");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(f);
			ois = new ObjectInputStream(fis);
			Emp e = (Emp) ois.readObject(); // type casting
			System.out.println(e);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();
			} catch (IOException e) {
			}
		}
		
 
	}

}
