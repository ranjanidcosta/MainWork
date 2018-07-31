package com.ranjani.service;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Map;

import com.ranjani.bean.Customer;
import com.ranjani.dao.BankingDao;
import com.ranjani.dao.BankingDaoImpl;
import com.ranjani.dao.BankingDaoImplSQL;
import com.ranjani.exception.BankingException;

public class BankingServiceImpl implements BankingService {

	BankingDao bdao;

	public BankingServiceImpl() {
		//bdao = new BankingDaoImpl();
		bdao = new BankingDaoImplSQL();
	}

	@Override
	public boolean register(Customer cust) throws BankingException {
		return bdao.register(cust);

	}

	@Override
	public Map<Long, Customer> getCustomer() throws BankingException {
		// TODO Auto-generated method stub
		return bdao.getCustomer();
	}

	@Override
	public boolean isNameValid(String fname) {
		boolean valid = false;
		valid = fname.matches("[A-Z][a-z]+");
		return valid;
	}

	@Override
	public LocalDate getDob(String dobStr) throws BankingException {
		LocalDate date = null;
		try {
			date = LocalDate.parse(dobStr);
		} catch (DateTimeParseException e) {
			throw new BankingException("The date is not valid");
		}
		return date;
	}

	@Override
	public Customer getCustomer(long custNoRetrieve) throws BankingException {
		// TODO Auto-generated method stub
		return bdao.getCustomer(custNoRetrieve);
	}

	@Override
	public boolean depositAmount(long custNoRetrieve, double depositAmount) throws BankingException {
		
		return bdao.depositAmount(custNoRetrieve, depositAmount);
	}

	@Override
	public boolean withdrawAmount(long custNoRetrieve, double withdrawAmount) throws BankingException {
		
		return bdao.withdrawAmount(custNoRetrieve, withdrawAmount);
	}

	@Override
	public double getBalance(long custNoRetrieve) throws BankingException {
		// TODO Auto-generated method stub
		return bdao.availableBalance(custNoRetrieve);
	}

	@Override
	public void closeResource() {
		bdao.closeResource();
		
	}
	
}
