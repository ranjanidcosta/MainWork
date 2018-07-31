package com.ranjani;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class MyJdbcProcedure {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ranjani", "ranjani");
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the employee id");
			CallableStatement cstmt = con.prepareCall("call get_allowance(?,?,?)");
			int empid = scan.nextInt();
			cstmt.setInt(1, empid);
			cstmt.registerOutParameter(2, Types.INTEGER);
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.executeUpdate();
			int allowance = cstmt.getInt(2);
			String message = cstmt.getString(3);
			if (message.equals("noerror")) {
				System.out.println("Allowance: " + allowance);
			} else {
				System.out.println(message);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
