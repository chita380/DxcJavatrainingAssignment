package encapsulationandinheritance;

import java.util.Scanner;

public class BookDetails   {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book();
		
		
		System.out.println("Enter the book number");
		Scanner sc = new Scanner(System.in);
		int bookNo =sc.nextInt();
		
		System.out.println("Enter the book title");
		Scanner sc1 = new Scanner(System.in);
		String title =sc1.nextLine();
		
		System.out.println("Enter the book Author name");
		Scanner sc2 = new Scanner(System.in);
		String author =sc2.nextLine();
		
		System.out.println("Enter the book Price");
		Scanner sc3 = new Scanner(System.in);
		float price =sc3.nextFloat();
		
		
		
		book1.setBookNo(bookNo);
		book1.setTitle(title);
		book1.setAuthor(author);
		book1.setPrice(price);
		
		System.out.println("Book No:"+book1.getBookNo());
		System.out.println("Book Title:"+book1.getTitle());
		System.out.println("Book Author:"+book1.getAuthor());
		System.out.println("Book Price:"+book1.getPrice());		
	}

	

	

}
