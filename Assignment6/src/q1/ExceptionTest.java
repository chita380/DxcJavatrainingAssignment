package q1;

public class ExceptionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res;
		try{
		res = (Integer.parseInt(args[0])/Integer.parseInt(args[1]));
		System.out.println("first element:"+args[0]);
		System.out.println("first element:"+args[1]);
		System.out.println("Result is "+res);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("No Input received");
		}
		catch(NumberFormatException e){
			System.out.println("Only integers are allowed");
		}
		
		catch(ArithmeticException e){
			System.out.println("Division with zero is not possible");
		}
		
		
		
	}

}
