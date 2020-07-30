package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Desr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Engine e1 = new Engine("A123", 2000);
		Car car = new Car("asd12hj", "Honda", e1);*/
		
		try {
			FileInputStream fis = new FileInputStream("D:\\Cardataser.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Car car = (Car) ois.readObject();
			System.out.println("derilized");
			fis.close();
			ois.close();
			//System.out.println(car.getCarMake());
			//System.out.println(car.getRegistrationNo());
			System.out.println(car.toString());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
