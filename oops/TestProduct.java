package oops;

public class TestProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product("Laptop", 45000, 'E');
		System.out.println("Product Details:" + p1.getProductDetails());
		Product p2 = new Product("Mobile", 10000);
		System.out.println("Product Details:" + p2.getProductDetails());
		

	}

}
