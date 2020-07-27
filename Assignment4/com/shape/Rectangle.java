package com.shape;

import java.util.Scanner;

public abstract class Rectangle implements Polygon{
	float length; 
	float breadth;
	public static void main(String[] args) {
		
		
	}

	public void calcArea() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of sides");
		float side = sc.nextFloat();
		System.out.println("Enter the Len of sides");
		length = sc.nextFloat();
		double angel =Math.toRadians(180/side);
		angel = Math.tan(angel);
		double area = (length*length*length/4*(angel));
		System.out.println("Area of polygon is :"+ area);
		}

	
	public void calcPeri() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of sides");
		float side = sc.nextInt();
		System.out.println("Enter the Len of sides");
		length = sc.nextFloat();
		
		double perimeter = length*side;
		System.out.println("Perimeter of polygon is :"+ perimeter);
	}
	
}
