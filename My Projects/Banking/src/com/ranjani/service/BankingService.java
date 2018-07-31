package com.ranjani.service;

import java.time.LocalDate;
import java.util.Map;

import com.ranjani.bean.Customer;
import com.ranjani.exception.BankingException;

public interface BankingService {

	boolean register(Customer cust) throws BankingException;

	Map<Long, Customer> getCustomer() throws BankingException;

	boolean isNameValid(String fname);

	LocalDate getDob(String dobStr) throws BankingException;

	Customer getCustomer(long custNoRetrieve) throws BankingException;

	boolean depositAmount(long custNoRetrieve, double depositAmount) throws BankingException;

	boolean withdrawAmount(long custNoRetrieve, double withdrawAmount) throws BankingException;

	double getBalance(long custNoRetrieve) throws BankingException;

	void closeResource();

}
