package com.ranjani;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) {
		File f = new File("output.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String input = br.readLine();
			System.out.println(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
