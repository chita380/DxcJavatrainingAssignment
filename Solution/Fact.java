package Solution;
import java.util.Scanner;
public class Fact {
	public static void main(String args[]){
		System.out.println("Enter the num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i,j,f=1,count=0;
		for(i=1;i<=num;i++)
		{
			f=f*i;
		}
		System.out.println("factorial is="+f);
		
}
}

