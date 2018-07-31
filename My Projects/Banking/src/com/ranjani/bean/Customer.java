package com.ranjani.bean;

import java.time.LocalDate;

public class Customer {
	private long accno;
	private String fname;
	private String lname;
	private LocalDate dob;
	private long mobile;
	private double balance=1000;
	public boolean depositBalance(double amount) {
		balance+=amount;
		return true;
	}
	public boolean withdrawBalance(double amount) {
		balance-=amount;
		if (balance < 1000)
		{
			return false;
		}
		return true;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer() {

	}
	public Customer(long accno, String fname, String lname, LocalDate dob, long mobile, double balance) {
		this.accno = accno;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.mobile = mobile;
		this.balance = balance;
	}
	public Customer(long accno, String fname, String lname, LocalDate dob, long mobile) {
		this.accno = accno;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "\nCustomer [accno=" + accno + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", mobile="
				+ mobile + ", balance=" + balance + "]";
	}
	public long getAccno() {
		return accno;
	}
	public void setAccno(long accno) {
		this.accno = accno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

}
