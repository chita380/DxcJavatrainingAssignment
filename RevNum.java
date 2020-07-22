package Solution;

import java.util.Scanner;

public class RevNum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		int r,y=0;
		while(num!=0)
		{
			r=num%10;
			y=y*10+r;
			num=num/10;
		}
		System.out.println("Rev num is"+y);
	}

}
