package com.test;

import com.shape.Rectangle;
import com.shape.Square;

public class ExampleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Square sq = new  Square(){};
		 Rectangle rect = new Rectangle(){};
		 sq.calcArea();
		 sq.calcPeri();
		 rect.calcArea();
		 rect.calcPeri();
		 

	}

}
