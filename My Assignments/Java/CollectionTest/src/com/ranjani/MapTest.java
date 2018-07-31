package com.ranjani;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, String> productMap = new HashMap<>();
		productMap.put("Mobile", "Samsung");
		productMap.put("WashingMachine", "IFB");
		productMap.put("2Wheeler", "Honda");
		System.out.println(productMap);
		System.out.println(productMap.get("Mobile"));
		Set<String> keySet = productMap.keySet();
		System.out.println(keySet);
	}

}
