package ioAss;

import java.io.File;
import java.io.IOException;

//import sun.font.CreatedFontTracker;

public class TestFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("D:\\Badminton\\courts\\smash.dat");
		file1.mkdir();
		File file2 = new File(file1,"singles.txt");
		File file3 = new File(file1,"dubbles.txt");
		try {
			file2.createNewFile();
			file3.createNewFile();
			System.out.println("File created sucess");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		File f4 = new File("doubles.txt");
		file3.renameTo(f4);
		
			file2.delete();
			System.out.println("File Delete sucess");
	}

}
