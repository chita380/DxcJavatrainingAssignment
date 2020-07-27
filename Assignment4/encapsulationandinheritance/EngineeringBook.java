package encapsulationandinheritance;

public class EngineeringBook extends Book {

	private String category; 
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		EngineeringBook enggbook = new EngineeringBook();
		enggbook.setCategory("ECE");
		enggbook.setAuthor("A.P.J");
		enggbook.setBookNo(1);
		enggbook.setPrice(123.60f);
		enggbook.setTitle("English");
		System.out.println("Book Category:"+enggbook.getCategory());
		System.out.println("Book No:"+enggbook.getBookNo());
		System.out.println("Book Title:"+enggbook.getTitle());
		System.out.println("Book Author:"+enggbook.getAuthor());
		System.out.println("Book Price:"+enggbook.getPrice());		
		
		
	
		
		

	}

}
