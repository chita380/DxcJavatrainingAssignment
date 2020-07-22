package Solution;
import java.util.Scanner;
public class PrimeNumRange {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lower range num");
		int Lnum = sc.nextInt();
		System.out.println("Enter the upper range num");
		int Unum = sc.nextInt();
		int i,j,c;
		for(i=Lnum;i<=Unum;i++)
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

