package com.ranjani.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.ranjani.exception.BankingException;

public class DBUtil {
	static Connection con = null;
	static Logger logger = Logger.getLogger(DBUtil.class);
	public static Connection getConnection() throws BankingException {
		try {
			if (con == null || con.isClosed()) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("Driver class loaded");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ranjani", "ranjani");
				System.out.println("Connection established");
			}
		} catch (SQLException e) {
			//e.printStackTrace();
			logger.fatal(e);
			throw new BankingException("Error in Getting DB connection");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			logger.fatal(e);
			throw new BankingException("Error in creating db connection");
		}
		return con;
	}

	public static void closeConn() {
		try {
			if (con != null)
				con.close();
		} catch (SQLException e) {
		}
	}

}
