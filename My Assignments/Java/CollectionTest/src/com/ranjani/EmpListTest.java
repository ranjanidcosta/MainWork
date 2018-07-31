package com.ranjani;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpListTest {

	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		empList.add(new Emp(88, "Zra", 52545245l));
		empList.add(new Emp(22, "Afd", 8457536l));
		empList.add(new Emp(34, "Prw", 1223525l));
		System.out.println(empList);
		System.out.println("Sorted by Name reverse:");
		Collections.sort(empList,new EmpCompartor(EmpCompartor.REVERSE));
		System.out.println(empList);
		System.out.println("Sorted by ID:");
		Collections.sort(empList,new EmpCompartor(EmpCompartor.ID));
		System.out.println(empList);
		System.out.println("Sorted by MOBILE:");
		Collections.sort(empList,new EmpCompartor(EmpCompartor.MOBILE));
		System.out.println(empList);
	}

}
