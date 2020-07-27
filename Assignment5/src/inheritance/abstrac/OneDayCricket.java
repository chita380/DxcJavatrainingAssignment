package inheritance.abstrac;

public class OneDayCricket extends Cricket {

	

	

	public OneDayCricket(int maxOvers, int targetScore) {
		super(maxOvers, targetScore);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcCurrentRunrate() {
		// TODO Auto-generated method stub
		double CurrentRunrate = getCurrentScore() / getCurrentOver() ;
		System.out.println("CurrentRunrate:"+CurrentRunrate);
		return 0;
	}

	@Override
	public double calcReqdRunrate() {
		// TODO Auto-generated method stub
		double RequiredRunrate = ((getTargetScore() - getCurrentScore()) / (getMaxOvers() -getCurrentOver()));
		System.out.println("RequiredRunrate:"+RequiredRunrate);
		return 0;
	}

}
