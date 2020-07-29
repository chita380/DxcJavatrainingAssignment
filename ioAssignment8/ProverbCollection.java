package ioAss;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {

	/**
	 * @param args
	 */
	
		
		public static void storeProverb(String str)
		{
			try {
				FileOutputStream fos = new FileOutputStream("D:\\proverb\\TopProverbs.txt",true);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				bos.write(str.getBytes());
				
				bos.flush();
				} 
				catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
				catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str1="";
				
			while(true)
			{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Proverb or Zero to terminate");
			str1 = sc.nextLine();
			if(str1.equals("0"))
			{
				break;
			}
			else
			{
				storeProverb(str1);
				
			}
			}
			System.out.println("user terminated");
			
		}
		
	}
	


