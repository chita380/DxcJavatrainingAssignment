package Solution;

public class StudentParcent {
	
	float sub1;
	float sub2;
	float result;
	
	public void computeresult(){
		result=(((sub1+sub2)/200)*100);
	}
	
	public float getSub1() {
		return sub1;
	}
	public void setSub1(float sub1) {
		this.sub1 = sub1;
	}
	public float getSub2() {
		return sub2;
	}
	public void setSub2(float sub2) {
		this.sub2 = sub2;
	}
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}

}
