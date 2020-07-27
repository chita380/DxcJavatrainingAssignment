package q2;


public class TestCostomer1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			Customer c1= new Customer("Chita","chitaqw","Gold");
			System.out.println(c1.getCustNo());
			System.out.println(c1.getCustName());
			System.out.println(c1.getCategory());
			}
		catch(CustumException1 p){
			System.out.println("Invalid user input");
			}
		
		
		

	

}
}
