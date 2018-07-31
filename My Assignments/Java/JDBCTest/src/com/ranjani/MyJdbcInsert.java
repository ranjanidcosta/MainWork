package com.ranjani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MyJdbcInsert {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ranjani", "ranjani");
			con.setAutoCommit(false);
			Scanner scan = new Scanner(System.in);
			//System.out.println("Enter the order id");
			//int orderid = scan.nextInt();
			System.out.println("Enter the product name");
			String product = scan.next();
			System.out.println("Enter the price");
			double price = scan.nextDouble();
			System.out.println("Enter the quantity");
			int quantity = scan.nextInt();
			PreparedStatement stmt = con
					.prepareStatement("INSERT into prodorder(orderid, product,price,quantity) values(prod_seq.NEXTVAL,?,?,?)");
			//stmt.setInt(1, orderid);
			stmt.setString(1, product);
			stmt.setDouble(2, price);
			stmt.setInt(3, quantity);
			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Data inserted successfully ");
				con.commit();
			} else {
				System.out.println("Failed to insert data");
				con.rollback();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
