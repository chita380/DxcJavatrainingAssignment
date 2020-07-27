package q2;

//import com.userdefined.CustumException1;

public class Customer {
	private String custNo;
	private String custName;
	private String category;
	public Customer(String custNo,String custName,String category) throws CustumException1 {
		String str = custName;
		if(custNo.charAt(0) != 'C' || custNo.charAt(0) != 'c')
			throw new CustumException1("custNo must start with ‘C’ or ‘c’"+custNo);
		else if(!(str.length()>=4))
			throw new CustumException1("custName must be atleast of 4 characters"+custName);
		else if(category != "Platinum" || category != "Gold" || category != "Silver")
			throw new CustumException1("category must be either ‘Platinum’ , ‘Gold’ or ‘Silver’ "+category);
		else{
			this.custNo = custNo;
			this.custName=custName;
			this.category=category;
		}
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
