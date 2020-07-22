package Solution;
import java.util.Scanner;
public class GivenDigitToWord {

	static String words[] = {"Zero","one","two","three","four","five","six","seven","eight","nine"};
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit value");
		int digit = sc.nextInt();	
		System.out.println("the entered digit is"+ words[digit]);
	}

}
