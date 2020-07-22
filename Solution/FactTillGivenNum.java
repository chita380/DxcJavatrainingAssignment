package Solution;

import java.util.Scanner;

public class FactTillGivenNum {
	public static void main(String args[]){
		System.out.println("Enter the num");
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		int i,j,f=1,count=0;
		int num;
		for(num=1;num<=ip;num++){
			f=1;
			count=0;
		for(i=1;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println("factorial is="+f);
		
		for(j=1;j<=f;j++){
			if(f%j==0)
				count++;
			}
			if(count==2)
			{
				System.out.println("factorial is prime ");
			}
			else
			{
				System.out.println("factroial is not a prime ");
			}
		
		}
	
	}
}
