package com.dxc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "DXC";
		String pass = "chita";

		// Inserting data using SQL query
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr prod code");
		int i =sc.nextInt();
		String sql = "select * from PRODUCTS where PROD_CODE="+i;
		Connection con = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);

			while (result.next()) {
				System.out.println("Product Details:"+"\ncode:"+result.getString("PROD_CODE") + "" +"\nName:"+ result.getString("PROD_NAME")+""+"\nPrice:"+ result.getString("PROD_PRICE")+""+"\nCategory:"+result.getString("PROD_CATG"));
			}

		} catch (Exception ex) {
			System.err.println(ex);
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				System.out.println(e);
			}
		}
		
		
		
	}

}
