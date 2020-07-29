import java.util.*;

public class ScoreCard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<String, Integer>();
	Scanner sc = new Scanner(System.in);
	int ar[] = new int[5];
	System.out.println("Enter runs score");
	for (int i = 0; i < ar.length; i++)
		ar[i] = sc.nextInt();

	map.put("Rahane", ar[0]);
	map.put("Rahul", ar[1]);
	map.put("Kohli", ar[2]);
	map.put("Dhoni", ar[3]);
	map.put("Lokesh", ar[4]);
	
	
	
	
	int max = 0;
	int sum = 0;

	for (Map.Entry<String, Integer> me : map.entrySet()) {
		System.out.print(me.getKey() + ":");
		System.out.println(me.getValue());
		if (max < me.getValue()) {
			max = me.getValue();
		}
		sum = sum + me.getValue();
	}
	System.out.println("The total Score is "+sum);
	System.out.println("The max run getter is"+max);
	System.out.println("Run scored by Dhoni is"+ar[3]);

}
}