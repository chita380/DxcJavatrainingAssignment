package com.dxc.jdbc;
import java.sql.SQLException;
import java.util.*;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class ProductDemo3 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String input;
			int pCode;
			String pName;
			double pPrice;
			String pCat;
			ArrayList<Product> product = new ArrayList<>();

			while (true) {
				System.out.println("Press any key to input values, -1 to exit");

				input = sc.nextLine();

				if (input.equals("-1")) {
					break;
				} else {
					System.out.println("Enter Product Code");
					pCode = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Product Name");
					pName = sc.next();
					sc.nextLine();
					System.out.println("Enter Product Price");
					pPrice = sc.nextDouble();
					sc.nextLine();
					System.out.println("Enter Product Category");
					pCat = sc.next();
					sc.nextLine();
					product.add(new Product(pCode, pName, pPrice, pCat));

				}
			}

			try {
				JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();
				rs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
				rs.setUsername("DXC");
				rs.setPassword("chita");
				rs.setCommand("select PROD_CODE,PROD_NAME,PROD_PRICE,PROD_CATG from PRODUCTS");
				rs.execute();
				// Update

				for (int i = 0; i < product.size(); i++) {
					Product data = product.get(i);

					int pCode1 = data.getPROD_CODE();
					String pName1 = data.getPROD_NAME();
					Double pPrice1 = data.getPROD_PRICE();
					String pCat1 = data.getPROD_CATG();
					rs.beforeFirst();
					rs.moveToInsertRow();
					rs.updateInt("PROD_CODE", pCode1);
					rs.updateString("PROD_NAME", pName1);
					rs.updateDouble("PROD_PRICE", pPrice1);
					rs.updateString("PROD_CATG", pCat1);
					rs.insertRow();
					System.out.println("insert sucess");
				}

				rs.beforeFirst();
				while (rs.next()) {
					System.out.println(rs.getString("PROD_CODE") + ":" + rs.getString("PROD_NAME") + ":"
							+ rs.getString("PROD_PRICE") + ":" + rs.getString("PROD_CATG"));
				}
			}

			catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
	

