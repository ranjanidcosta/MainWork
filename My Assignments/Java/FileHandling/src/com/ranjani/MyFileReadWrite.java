package com.ranjani;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReadWrite {

	public static void main(String[] args) {
		File f = new File("output.txt");
		File f1 = new File("output1.txt");
		FileReader fr = null;
		BufferedReader bfr = null;
		FileWriter fw = null;
		BufferedWriter bfw = null;
		try {
			fr = new FileReader(f);
			bfr = new BufferedReader(fr);
			fw = new FileWriter(f1, true);
			bfw = new BufferedWriter(fw);
			String input = null;//bfr.readLine();
			//while (input != null) {
			while((input=bfr.readLine())!=null) {
				
				bfw.write(input);
				bfw.newLine(); // bfw.write(System.getProperty("line.separator"));
				//bfw.write("\n");
				//input = bfr.readLine();
				System.out.println(input);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				bfw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}