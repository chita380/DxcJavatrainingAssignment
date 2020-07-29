package ioAss;

import java.io.File;

public class FolderInfo {

	/**
	 * @param args
	 */
	
	public static void printDirectory(String path)
	{
		int count=0;
		File myFile = new File(path);
		File[] fileList = myFile.listFiles();
		for (File file : fileList) {
			if (file.isFile()) {

				System.out.println("File :"+file.getName());
				System.out.println("Absoloute Path :"+file.getAbsolutePath());
				System.out.println("Folder Path :"+file.getParent());
				count=1;
			}
			if(file.isDirectory()) {
				System.out.println("Directory: "+file.getName());
				System.out.println("Folder Path :"+file.getParent());
				count=1;
			}
		}
		if(count==0)
			System.out.println("No directory and file exists");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDirectory("D:\\Badminton");
	}

}
