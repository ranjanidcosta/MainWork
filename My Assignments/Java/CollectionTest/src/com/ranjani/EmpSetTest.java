package com.ranjani;

import java.util.HashSet;
import java.util.Set;

public class EmpSetTest {

	public static void main(String[] args) {
		Set<Emp> empSet = new HashSet<>();
		empSet.add(new Emp(88, "Zra", 52545245l));
		empSet.add(new Emp(22, "Afd", 8457536l));
		empSet.add(new Emp(34, "Prw", 1223525l));
		empSet.add(new Emp(88, "Zra", 52545245l));
		System.out.println(empSet);
	}

}
