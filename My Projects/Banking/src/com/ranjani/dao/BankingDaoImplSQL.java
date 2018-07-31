package com.ranjani.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.ranjani.bean.Customer;
import com.ranjani.exception.BankingException;
import com.ranjani.util.DBUtil;

public class BankingDaoImplSQL implements BankingDao {

	private String insertQuery = "insert into customer (accno,fname,lname,dob,mobile,balance) values(?,?,?,?,?,?)";
	private String selectQuery = "select fname,lname,dob,mobile,balance from customer where accno=?";
	private String selectAllQuery = "select accno,fname,lname,dob,mobile,balance from customer";
	private String selectBalanceQuery = "select balance from customer where accno = ?";
	private String updateBalanceQuery = "update customer set balance =? where accno=?";
	Logger logger = Logger.getLogger(BankingDaoImplSQL.class);

	public BankingDaoImplSQL() {
		//System.out.println("dao init");
		logger.info("init()");
	}

	@Override
	public boolean register(Customer cust) throws BankingException {
		boolean success = false;
		//System.out.println("dao register ");
		logger.info("register customer : " + cust);
		Connection con = DBUtil.getConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(insertQuery);
			pstmt.setLong(1, cust.getAccno());
			pstmt.setString(2, cust.getFname());
			pstmt.setString(3, cust.getLname());
			Date dob = Date.valueOf(cust.getDob());
			pstmt.setDate(4, dob);
			pstmt.setLong(5, cust.getMobile());
			pstmt.setDouble(6, cust.getBalance());
			int rows = pstmt.executeUpdate();
			if (rows > 0) {
				success = true;
			}

		} catch (SQLException e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		}
		return success;
	}

	@Override
	public Customer getCustomer(long accno) throws BankingException {
		System.out.println("dao get cust");
		Customer cust = null;
		Connection con = DBUtil.getConnection();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(selectQuery);
			pstmt.setLong(1, accno);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Date dob = rs.getDate(3);
				LocalDate ldob = dob.toLocalDate();
				cust = new Customer(accno, rs.getString(1), rs.getString(2), ldob, rs.getLong(4), rs.getDouble(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			logger.error(e.getMessage());
		}
		return cust;
	}

	@Override
	public Map<Long, Customer> getCustomer() throws BankingException {
		System.out.println("get cust map");
		Connection con = DBUtil.getConnection();
		PreparedStatement pstmt;
		Map<Long, Customer> custMap = new HashMap<>();
		try {
			pstmt = con.prepareStatement(selectAllQuery);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Date dob = rs.getDate(4);
				LocalDate ldob = dob.toLocalDate();
				Long accno = rs.getLong(1);
				Customer cust = new Customer(accno, rs.getString(2), rs.getString(3), ldob, rs.getLong(5),
						rs.getDouble(6));
				custMap.put(accno, cust);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return custMap;
	}

	@Override
	public boolean depositAmount(long custNoRetrieve, double depositAmount) throws BankingException {
		//System.out.println("dao deposit");
		logger.info("deposit amount, " + custNoRetrieve+", "+depositAmount);
		Connection con = DBUtil.getConnection();
		Double amt;
		PreparedStatement pstmt;
		boolean success = false;
		try {
			pstmt = con.prepareStatement(selectBalanceQuery);
			pstmt.setLong(1, custNoRetrieve);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				amt = rs.getDouble(1);
				amt += depositAmount;
				pstmt = con.prepareStatement(updateBalanceQuery);
				pstmt.setDouble(1, amt);
				pstmt.setLong(2, custNoRetrieve);
				int rows = pstmt.executeUpdate();
				if (rows > 0) {
					logger.info("deposit success, bal: " + amt);
					success = true;
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return success;
	}

	@Override
	public boolean withdrawAmount(long custNoRetrieve, double withdrawAmount) throws BankingException {
		System.out.println("dao withdraw");
		Connection con = DBUtil.getConnection();
		Double amt;
		PreparedStatement pstmt;
		boolean success = false;
		try {
			pstmt = con.prepareStatement(selectBalanceQuery);
			pstmt.setLong(1, custNoRetrieve);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				amt = rs.getDouble(1);
				amt-= withdrawAmount;
				if (amt < 1000) {
					success = false;
					throw new BankingException("Insufficient Balance");
				} else {
					pstmt = con.prepareStatement(updateBalanceQuery);
					pstmt.setDouble(1, amt);
					pstmt.setLong(2, custNoRetrieve);
					int rows = pstmt.executeUpdate();
					if (rows > 0) {
						success = true;
					}
					else {
						throw new BankingException("Error in updating balance");
					}
				}
			}
		} catch (SQLException e) {
			
			throw new BankingException("Error in Database");
		}
		return success;
	}

	@Override
	public double availableBalance(long custNoRetrieve) throws BankingException {
		System.out.println("dao balance");
		Connection con = DBUtil.getConnection();
		PreparedStatement pstmt;
		double balance = 0;
		try {
			pstmt = con.prepareStatement(selectBalanceQuery);
			pstmt.setLong(1, custNoRetrieve);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				balance = rs.getDouble(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return balance;
	}

	@Override
	public void closeResource() {
		System.out.println("closing conn");
		DBUtil.closeConn();

	}

}
