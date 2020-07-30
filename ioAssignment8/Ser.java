package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engine e1 = new Engine("A123", 2000);
		Car car = new Car("asd12hj", "Honda", e1);
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\Cardataser.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(car);
			System.out.println("serilized");
			fos.close();
			oos.close();
			System.out.println(car.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
}
