package com.ranjani;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJdbcTest {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver class loaded");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ranjani", "ranjani");
			System.out.println("Connection established");
			Statement stmt = con.createStatement();
			System.out.println("Statement created");
			ResultSet rs = stmt.executeQuery("select * from customer");
			while (rs.next()) {
				// System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +
				// rs.getDouble(3) + " " + rs.getInt(4));
				System.out.println(rs.getObject(1) + ", " + rs.getObject(2) + ", " + rs.getObject(3) + ", "
						+ rs.getObject(4) + ", " + rs.getObject(5) + ", " + rs.getObject(6));
			}
			System.out.println();
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
/*
 * CREATE table prodorder (orderid number(10) primary key, product varchar2(40),
 * price number(7,2), quantity number(5)); INSERT into prodorder(orderid,
 * product,price,quantity) values(12011,'Mobile',8000,3);
 */
