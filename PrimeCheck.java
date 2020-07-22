package Solution;
import java.util.Scanner;
public class PrimeCheck {
	public static void main(String args[]){
		System.out.println("Enter the num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int c=0,i;
		for(i=1;i<=num;i++){
		if(num%i==0)
			c++;
		}
		if(c==2)
			System.out.println("num is prime ");
		
		else
			System.out.println("num is not a prime ");
		

}
}
