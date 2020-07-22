package Solution;
import java.util.Scanner;
public class SumOfDigit {
	public static void main(String args[]){
		System.out.println("Enter the digit");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int s=0,r;
		while(digit!=0)
		{
		r=digit%10;
		digit=digit/10;
		s=s+r;
		}
		System.out.println("Sum of digit is="+s);
	}
}
