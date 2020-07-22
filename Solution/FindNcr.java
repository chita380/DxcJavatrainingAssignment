package Solution;
import java.util.Scanner;

public class FindNcr {
	
	public static int fact(int num)
	{	
		int i,f=1;
		for(i=1;i<=num;i++)
		{
			f=f*i;
		}	
		return f;
	}
	public static void main(String args[]){
		int res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value");
		int n = sc.nextInt();	
		System.out.println("Enter the r value");
		int r = sc.nextInt();	
		res=((fact(n))/(fact(n-r)*fact(r)));
		System.out.println("ncr is"+res);
	
	}
}
		
		
		
	


