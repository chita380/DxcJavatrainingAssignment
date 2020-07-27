package agreegationencapsulation;

public class Customer {
	private String customerName;
	private Address residentialAddress;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, Address residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	
	public String getCustomerDetails()
	{
		String str = "Costumer Name:"+customerName + "Residential Address:" + residentialAddress;
		return str;
		
	}
	
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	
	
}
