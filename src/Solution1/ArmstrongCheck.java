package Solution1;

import java.util.Scanner;

public class ArmstrongCheck {
			
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = sc.nextInt();
		
		int x,r,s=0;
		x=num;
		while(x != 0)
		{
			r=x%10;
			s=s+r*r*r;
			x=x/10;
		}
		if(s==num)
		{
			System.out.println(" the num is armstrong");
		}
		else
		{
			System.out.println("the num is not a armstrong");
		}

	}

}
