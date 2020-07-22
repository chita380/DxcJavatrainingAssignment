package oops;

public class Account {
	double balance;
	boolean active;
	
	public Account(boolean active) {
		super();
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Account() {
	// Default Constructor
	}
	
	public void depositAmount (int amt)
	{
		if (active == true){
			this.balance=this.balance+amt;
			System.out.println("Account Active Balance is" +balance);
		}
		else
			System.out.println("Account is INactive");
	}
}
