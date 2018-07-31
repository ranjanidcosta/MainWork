package com.ranjani;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
// serialization
public class EmpWriter {

	public static void main(String[] args) {
		Emp e = new Emp(23,"ranj",8944243l);
		File f = new File("EmpOutput.ser");
		// byte stream
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(e);
			System.out.println("Emp Saved");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (IOException e1) {
			}
		}
		
		

	}

}
