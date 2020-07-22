package Solution1;

import java.util.Scanner;

public class CubeSeries {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		int i,s=0;
		for(i=1;i<=n;i++)
		{
		s=i*i*i;
		System.out.println(+s);
		
		
		}
	}

}
