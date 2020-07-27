package agreegationencapsulation;

public class Address {
	
	private String addressLine;
	private String city;
	
	@Override
	public String toString() {
		return " Address [addressLine=" + addressLine + ", city=" + city + "]";
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAddressDetails()
	{
		String str = "Address line:"+ addressLine + "city:"+ city ;
		return str;
	}
	public String getAddressLine() {
		return addressLine;
	}
	

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

}
