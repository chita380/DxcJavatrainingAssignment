package q3;
import java.util.Scanner;
public class AgeCalculator1 {
	public static int calculateAge(String str)
	{
		int age=0;
		int y1=Character.getNumericValue(str.charAt(6));
		int y2=Character.getNumericValue(str.charAt(7));
		int y3=Character.getNumericValue(str.charAt(8));
		int y4=Character.getNumericValue(str.charAt(9));
		int year=y1*1000+y2*100+y3*10+y4;
		age=2020-year;
		return age;
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the dob");
		String dob=scan.nextLine();
		
		try
		{
		if(dob.matches("\\d{2}/\\d{2}/\\d{4}"))
		{
			System.out.println(AgeCalculator1.calculateAge(dob));	
		}
		else
			throw new Custumnexception2("The date of birth should be in dd/mm/yyyy");
		}
		catch(Custumnexception2 e)
		{
			System.out.println("Invalid date format");
		}

}
	
}


