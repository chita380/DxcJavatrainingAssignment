package Solution;

import java.util.Scanner;

public class PalindromeCheck {
	
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the num");
	int num = sc.nextInt();
	int r,y=0;
	 int p=num;
	while(p!=0)
	{
		r=num%10;
		y=y*10+r;
		p=p/10;
	}
	//System.out.println("Rev Num Is"+y);
	if(num==y)
		System.out.println("num is palindrome");
	else
		System.out.println("num is not palindrome");
}
}
