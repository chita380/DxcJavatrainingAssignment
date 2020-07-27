package inheritance.abstrac;

public abstract class Cricket {

	private int maxOvers;    
	private int targetScore;
	private int currentOver;
	private int currentScore;
	
	public abstract double calcCurrentRunrate() ;
	public abstract double calcReqdRunrate();
	
	public Cricket(int maxOvers, int targetScore) {
		super();
		this.maxOvers = maxOvers;
		this.targetScore = targetScore;
	}
	public int getCurrentOver() {
		return currentOver;
	}
	public void setCurrentOver(int currentOver) {
		this.currentOver = currentOver;
	}
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public int getMaxOvers() {
		return maxOvers;
	}
	public int getTargetScore() {
		return targetScore;
	}
}
