package oops;

public class Product {
	
	private static int productcount = 100;
	private String productCode;
	private String productName ;
	private double productPrice ; 
	private char categoryCode;
	
	

	public Product(String productName, double productPrice) {
		super();
		productcount++;
		
		this.categoryCode = 'E';
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCode = generateProductCode (categoryCode,productcount);
		
		}


	public Product(String productName, double productPrice, char categoryCode) {
		super();
		productcount++;
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = categoryCode;
		this.productCode = generateProductCode (categoryCode,productcount);
	}
	
	public String getProductDetails()
	{
		String str = "Product Code:"+productCode     +"Product name:"+productName    +"Category Code:" + categoryCode    + "Product price:"+productPrice ;
		return str;
		
	}

	private String generateProductCode (char categoryCode,int productcount)
	{
		productCode = categoryCode + Integer.toString (productcount) ;
																									
		return productCode;
	}
	
	public static int getProductcount() {
		return productcount;
	}
	public static void setProductcount(int productcount) {
		Product.productcount = productcount;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public char getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}
	

	
}
