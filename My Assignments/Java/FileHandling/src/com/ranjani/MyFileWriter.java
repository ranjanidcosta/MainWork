package com.ranjani;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {

	public static void main(String[] args) {
		File f = new File("output.txt");
		// character stream
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(f, true);
			bw = new BufferedWriter(fw);
			bw.write("Hi there!");
			System.out.println("File writing completed");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
		}
		}

	}

}
