package com.dxc.jdbc;

public class Product {

	int PROD_CODE;
	String PROD_NAME;
	double PROD_PRICE;
	String PROD_CATG;
	public int getPROD_CODE() {
		return PROD_CODE;
	}
	public void setPROD_CODE(int pROD_CODE) {
		PROD_CODE = pROD_CODE;
	}
	public String getPROD_NAME() {
		return PROD_NAME;
	}
	public void setPROD_NAME(String pROD_NAME) {
		PROD_NAME = pROD_NAME;
	}
	public Double getPROD_PRICE() {
		return PROD_PRICE;
	}
	public void setPROD_PRICE(Float pROD_PRICE) {
		PROD_PRICE = pROD_PRICE;
	}
	public String getPROD_CATG() {
		return PROD_CATG;
	}
	public void setPROD_CATG(String pROD_CATG) {
		PROD_CATG = pROD_CATG;
	}
	public Product(int pROD_CODE, String pROD_NAME, Double pROD_PRICE, String pROD_CATG) {
		super();
		PROD_CODE = pROD_CODE;
		PROD_NAME = pROD_NAME;
		PROD_PRICE = pROD_PRICE;
		PROD_CATG = pROD_CATG;
	}
	
	
}
