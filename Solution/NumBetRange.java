package Solution;

import java.util.Scanner;

public class NumBetRange {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower range num");
		int Lnum = sc.nextInt();
		System.out.println("Enter the upper range num");
		int Unum = sc.nextInt();
		int i;
		for(i=Lnum;i<=Unum;i++)
			System.out.println(+i);
}
}
