package aggregationncapsulation1;

public class TestCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		
		// TODO Auto-generated method stub
		Address a1 = new Address("PalurJunction","odisha");
		Address a2 = new Address("Elecrtrinics City","Bengaluru");
		Customer c1 = new Customer("Chita ", a1, a2);
		System.out.println(c1.getCustomerDetails());
		
		
		}

	
	
	
	public TestCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		

	

}
