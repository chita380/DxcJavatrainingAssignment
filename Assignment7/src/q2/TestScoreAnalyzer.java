package q2;


import java.util.Scanner;

public class TestScoreAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreAnalyzer sa = new ScoreAnalyzer();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of batsmam ");
		
		int numofbatsmam = sc.nextInt();
		
		System.out.println("enter the run");
		for (int i=0;i<numofbatsmam;i++)
		{
			//System.out.print((i+1));
			sa.addRunsToList(sc.nextInt());
		}
		
		sa.displayRuns();
		System.out.println("runrate:"+sa.calcRunRate());
		System.out.println("Lowest Run:"+sa.lowestRunsScored());
		System.out.println("count of player who did batting:"+numofbatsmam);
		
	}

}
