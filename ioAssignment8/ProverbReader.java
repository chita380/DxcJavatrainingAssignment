package ioAss;

import java.io.BufferedReader;

import java.io.FileReader;

public class ProverbReader {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str;
		BufferedReader bfr = new BufferedReader(new FileReader("D:\\proverb\\TopProverbs.txt"));
		while((str=bfr.readLine())!= null)
		{
			System.out.println(str);
		}
		
		
	}

}
