package oops;

public class AccountTest1 {

	int AccountNo;
	String Actype;
	double balance;
	
	
	public AccountTest1(int accountNo, String actype) {
		super();
		AccountNo = ++ accountNo ;
		Actype = actype;
	}
	public void depositAmount (int amt)
	{
	this.balance=this.balance+amt;
	
	}
	public void withdrawAmount (int amt)
	{
	if(amt<this.balance)
	this.balance=this.balance-amt;
	else
		System.out.println("Insuffisient balance");
	}
	public void display ()
	{
	String str = "Account Number:" +AccountNo + ","  +"Account Type:" +Actype + ","  + "Balance:" +  balance + ",";
	System.out.println("Account Details:" + str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountTest1 acc = new AccountTest1(1, "SB");
		acc.depositAmount(1200);
		acc.withdrawAmount(700);
		acc.display();

	}

}
