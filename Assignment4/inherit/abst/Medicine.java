package inherit.abst;

public abstract class Medicine {
	public double price;
	public String expirydate;
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}

	public abstract void displayLabel();
	public void getDetails()
	{
		System.out.println("Medicine: [price=" + price + ", expirydate=" + expirydate + "]"); 
	}

	
}
