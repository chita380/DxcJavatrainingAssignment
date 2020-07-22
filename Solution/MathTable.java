package Solution;
import java.util.Scanner;

public class MathTable {
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num");
	int num = sc.nextInt();
	int i,a;
	for(i=1;i<=10;i++)
	{
		a=num*i;
		System.out.println(+a);
	}
	
}
}
