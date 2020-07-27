package com.shape;

import java.util.Scanner;

public abstract class Square implements Polygon {
	 float side;
	 

	public void calcArea() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of sides");
		side = sc.nextInt();
		System.out.println("Enter the Len of sides");
		float Len = sc.nextFloat();
		double angel =Math.toRadians(180/side);
		angel = Math.tan(angel);
		double area = (Len*Len*Len/4*(angel));
		System.out.println("Area of polygon is :"+ area);
		}

	public void calcPeri() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of sides");
		side = sc.nextInt();
		System.out.println("Enter the Len of sides");
		float Len = sc.nextFloat();
		
		double perimeter = Len*side;
		System.out.println("Perimeter of polygon is :"+ perimeter);
	}
	 
	
}
