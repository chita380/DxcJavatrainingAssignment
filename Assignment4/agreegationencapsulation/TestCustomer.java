package agreegationencapsulation;

public class TestCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Address a1 = new Address("PalurJunction","odisha");
		c1.setCustomerName("Ranjan");
		c1.setResidentialAddress(a1);
		System.out.println("Costumer Name:"+c1.getCustomerName()+ "Residential Address:"+ c1.getResidentialAddress());
		Customer c2 = new Customer("Chita", a1);
		System.out.println(c2.getCustomerDetails());
		}

	public TestCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		

	

}
