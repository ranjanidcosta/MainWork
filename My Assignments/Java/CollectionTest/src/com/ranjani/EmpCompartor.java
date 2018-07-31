package com.ranjani;

import java.util.Comparator;

public class EmpCompartor implements Comparator<Emp> {

	private String criteria;
	public static final String ID = "id";
	public static final String MOBILE = "mobile";
	
	private int order = 1;
	public static final int FORWARD = 1;
	public static final int REVERSE = -1;
	
	
	@Override
	public int compare(Emp e1, Emp e2) {
		if (ID.equals(criteria)) {
			return e1.getId()-e2.getId();
		}
		else if (MOBILE.equals(criteria)) {
			return (int) (e1.getMobile()-e2.getMobile());	
		}
		
		return e1.getName().compareTo(e2.getName()) * order;
	}

	public EmpCompartor(int order) {
		super();
		this.order = order;
	}

	public EmpCompartor(String criteria) {
		this.criteria = criteria;
	}

}
