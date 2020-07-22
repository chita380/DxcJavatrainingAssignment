package oops;

public class GiftCardTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GiftCard g1 = new GiftCard(1234, 1000, true);
		g1.rechargeCard(2000);
		g1.swipeCard(400);
		g1.swipeCard(500);
		System.out.println("Final Balance is :" + g1.getBalance());
		
		System.out.println("Card Id is :" + g1.getCardNo());
		System.out.println("Card Status is :" + g1.isActive()); // true card active
																// False card inactive				
		GiftCard g2 = new GiftCard();
		//g2.setBalance(100);
		g2.setCardNo(5678);
		g2.setActive(true);
		g2.rechargeCard(3000);
		g2.swipeCard(500);
		g2.swipeCard(2600);
		System.out.println("Final Balance is :" + g2.getBalance());
		
		System.out.println("Card Id is :" + g2.getCardNo());
		System.out.println("Card Status is :" + g2.isActive()); // true card active
																// False card inactive
		
	}

}
