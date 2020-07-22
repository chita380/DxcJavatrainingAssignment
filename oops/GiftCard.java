package oops;

public class GiftCard {
	
	private long cardNo; 
	private double balance;
	private boolean active;
	
	
	
	public void swipeCard(int amt)
	{
		if(active == true){
		if(amt<balance){
		this.balance = this.balance - amt;
		System.out.println("Bal After Swipe:" +balance);
		}
		else
			System.out.println("Insuffisient Balance");
		}
		else
			System.out.println("Card Is Inactive");
	}
	public void rechargeCard(int amt)
	{
		if(active == true){
		this.balance = this.balance + amt ;
		System.out.println("Bal After Recharge:" +balance);
		}
		else
			System.out.println("Card Is Inactive");
	}
	
	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getBalance() {
		return balance;
	}
	

	public GiftCard() {
		super();
		// TODO Auto-generated constructor stub
		balance=0;
		cardNo=0;
		
	}

	public GiftCard(long cardNo, double balance, boolean active) {
		super();
		this.cardNo = cardNo;
		this.balance = balance;
		this.active = active;
	}




}
