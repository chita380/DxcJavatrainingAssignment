package com.dxc.jdbc;

import java.sql.*;
import java.util.Scanner;
public class ProductsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating the connection
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "DXC";
		String pass = "chita";

		// Inserting data using SQL query
		String sql = "select * from PRODUCTS";
		Connection con = null;
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

			// Reference to connection interface
			con = DriverManager.getConnection(url, user, pass);

			Statement st = con.createStatement();
			ResultSet result = st.executeQuery(sql);

			while (result.next()) {
				System.out.println(result.getString("PROD_CODE") + ":" + result.getString("PROD_NAME")+":"+ result.getString("PROD_PRICE")+":"+result.getString("PROD_CATG"));
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
