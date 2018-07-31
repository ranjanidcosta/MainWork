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
		return "Emp [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
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
	

}
