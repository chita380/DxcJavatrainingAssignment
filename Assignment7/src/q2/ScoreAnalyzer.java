package q2;

import java.util.LinkedList;
public class ScoreAnalyzer {
	

	int run,totrun=0;
	private LinkedList<Integer> runsData = new  LinkedList<Integer> ();

	public ScoreAnalyzer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	
	public void addRunsToList (int run)
	{
		runsData.add(run);
	}
	
	public double calcRunRate()
	{
	for(int i=0;i< runsData.size();i++ )
	{
		
		 totrun = totrun+runsData.get(i);
	}	
		double runrate = totrun/50 ;
		
		return runrate;
		
	}
	
	public int lowestRunsScored()
	{
		int min = runsData.get(0);
		for(int i=0;i< runsData.size();i++)
		{
			 if (min > runsData.get(i))
				 min = runsData.get(i);
		}
		return min;
		
	}
	
	public void displayRuns()
	{
		System.out.print("Runs scored by all player :");
		for(int i   : runsData  )
		{
			
			System.out.print(runsData.indexOf(i)+1+" - "+i+"\n");
		}
	}
	
}


