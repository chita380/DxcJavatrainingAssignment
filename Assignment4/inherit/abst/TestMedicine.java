package inherit.abst;

import java.util.Random;

public class TestMedicine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medicine med[] = new Medicine[5]; 
		
		Random random = new Random();
		int num = random.nextInt(3);
		if(num == 0)
		{
			med[0]= new Tablet();
			med[0].setPrice(100);
			med[0].setExpirydate("12/07/2025");
			med[0].getDetails();
			med[0].displayLabel();
		}
		if(num == 1)
		{
			med[1]= new Syrup();
			med[1].setPrice(200);
			med[1].setExpirydate("12/07/2024");
			med[1].getDetails();
			med[1].displayLabel();
		}
		
		if(num == 2)
		{
			med[2]= new Ointment();
			med[2].setPrice(300);
			med[2].setExpirydate("12/07/2023");
			med[2].getDetails();
			med[2].displayLabel();
		}
		
		
		
	}

}