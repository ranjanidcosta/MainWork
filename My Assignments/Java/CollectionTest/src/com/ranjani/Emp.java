package com.ranjani;

import java.io.Serializable;
// marker interface
public class Emp implements Serializable{
	private int id;
	private String name;
	private long mobile;
	public Emp() {
		super();		
	}
	public Emp(int id, String name, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "\nEmp [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	@Override
	public int hashCode() {
		//System.out.println("hashcode()... " + id);
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		//System.out.println("equals..");
		Emp e = (Emp)obj;
		return id== e.getId() && mobile==e.getMobile() && name.equals(e.getName());
	}
	

}
