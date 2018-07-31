package com.ranjani;

import java.nio.charset.Charset;
import java.util.Set;

public class Test40 {
public static void main(String[] args) {
	System.out.println("List of available char sets...");
	Set<String> str = Charset.availableCharsets().keySet();
	
	System.out.println(str);
}
}
