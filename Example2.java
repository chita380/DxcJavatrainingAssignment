package Solution;

public class Example2 {
	public static void main(String[] args) {
	BankApplication u1 = new BankApplication(1000,2000);
	BankApplication u2 = new BankApplication(1000,20);
	u1.balance();
	u2.balance();
	System.out.println("balance is "+u1.balance());
	System.out.println("balance is "+u2.balance());

}
}