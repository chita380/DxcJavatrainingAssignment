package Solution1;

import java.util.Scanner;

public class PrimeNumSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		int i,j,c;
		for(i=2;i<=n;i++)
		{
			c=0;
			for(j=1;j<=i;j++)
				{
				if(i%j==0)
					c++;
				}
				if(c==2)
					System.out.println(+i);
			}
		
		
}
}
