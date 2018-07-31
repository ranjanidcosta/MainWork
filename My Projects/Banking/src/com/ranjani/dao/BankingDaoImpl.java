package com.ranjani.dao;

import java.util.HashMap;
import java.util.Map;

import com.ranjani.bean.Customer;
import com.ranjani.exception.BankingException;

public class BankingDaoImpl implements BankingDao {

	Map<Long, Customer> custMap = new HashMap<>();
	@Override
	public boolean register(Customer cust) {
		boolean success = false;
		custMap.put(cust.getAccno(), cust);
		return success;
	}
	@Override
	public Map<Long, Customer> getCustomer() {
		
		return custMap;
	}
	
	@Override
	public Customer getCustomer(long accno) {
		// TODO Auto-generated method stub
		return custMap.get(accno);
	}
	@Override
	public boolean depositAmount(long custNoRetrieve, double depositAmount) {
		boolean success= false;
		Customer customer1 = custMap.get(custNoRetrieve);
		if (customer1 != null) {
		 customer1.depositBalance(depositAmount);
		 success = true;
		}
		return success;
	}
	@Override
	public boolean withdrawAmount(long custNoRetrieve, double withdrawAmount) throws BankingException {
		boolean success= false;
		Customer customer2 = custMap.get(custNoRetrieve);
		if (customer2 != null) {
		 success = customer2.withdrawBalance(withdrawAmount);
		 if(!success) {
			 throw new BankingException("Insufficient Balance");
		 }
		 //success = true;
		}
		return success;
	}
	@Override
	public double availableBalance(long custNoRetrieve) {
		Customer customer = custMap.get(custNoRetrieve);
		return customer.getBalance();
	}
	@Override
	public void closeResource() {
		// nothing to do
		
	}
}
