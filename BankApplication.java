package Solution;

public class BankApplication {
	
	float WithdrawAm;
	float DepAm;
	float balance;
	
	public BankApplication(int withdrawAm, int depAm) {
		super();
		WithdrawAm = withdrawAm;
		DepAm = depAm;
	}
	public float balance(){
		balance=DepAm-WithdrawAm;
		return balance;
	}
}

