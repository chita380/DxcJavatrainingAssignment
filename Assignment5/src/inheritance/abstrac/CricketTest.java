package inheritance.abstrac;

import java.util.Scanner;

public class CricketTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Target Score");
		int targetscoer = sc.nextInt();
		System.out.println("Enter current over");
		int currentover = sc.nextInt();
		System.out.println("Enter current Score");
		int currentScore = sc.nextInt();
		
		OneDayCricket odi = new OneDayCricket(50,targetscoer);
		odi.setCurrentOver(currentover);
		odi.setCurrentScore(currentScore);
		odi.calcCurrentRunrate();
		odi.calcReqdRunrate();
		

	}

}
