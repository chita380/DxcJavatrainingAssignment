package ioAss;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
//import java.util.Scanner;

public class FormatDocument {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the file name");
			String file1 =sc.next()+".txt";
			File file2 = new File("D:\\spaceremover\\file1");
			file2.createNewFile();

			
			FileReader fr = new FileReader("D:\\spaceremover\\spaceremove.txt");
			BufferedReader br = new BufferedReader(fr);
			PrintStream ps = new PrintStream("D:\\spaceremover\\file1");
			
			
			String line;
			while((line=br.readLine())!=null)
			{
				line = line.trim().replaceAll("\\s+", " ");
				ps.print(line);
				ps.println();
				ps.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
