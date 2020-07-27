package q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number of students");
		int totnumofSt = sc.nextInt();
		
		ArrayList<Integer> studentmarks = new ArrayList<Integer>();
		System.out.println("Enter the marks");
		for (int i = 0; i < totnumofSt; i++) {
			studentmarks.add(sc.nextInt());
		}
		
		int max = studentmarks.get(0);
		Iterator<Integer> itr = studentmarks.iterator();
		while (itr.hasNext()) {
			int next = itr.next();
			if (max < next)
				max = next;
			sum = sum + next;
		}
		double avg = sum / totnumofSt;
		System.out.println("The Highest marks is :" + max);
		System.out.println("The average marks is : " + avg);
		System.out.println("Third student marks is " + studentmarks.get(2));
		for (int i = 0; i < studentmarks.size(); i++) {
			System.out.print(i+1 + "-" + studentmarks.get(i)+"\n");
		}
		Collections.sort(studentmarks);
		
			for (int i = 0; i < studentmarks.size(); i++) {
			System.out.print(i+1 + "-" + studentmarks.get(i)+" ");
		}
		

	}
}
