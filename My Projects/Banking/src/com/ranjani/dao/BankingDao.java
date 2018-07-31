package com.ranjani.dao;

import java.util.Map;

import com.ranjani.bean.Customer;
import com.ranjani.exception.BankingException;

public interface BankingDao {

	boolean register(Customer cust) throws BankingException;

	Customer getCustomer(long accno) throws BankingException;
	
	Map<Long, Customer> getCustomer() throws BankingException;

	boolean depositAmount(long custNoRetrieve, double depositAmount) throws BankingException;

	boolean withdrawAmount(long custNoRetrieve, double withdrawAmount) throws BankingException;

	double availableBalance(long custNoRetrieve) throws BankingException;

	void closeResource();
}
