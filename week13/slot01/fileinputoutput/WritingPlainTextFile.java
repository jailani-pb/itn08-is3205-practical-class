package week13.slot01.fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class WritingPlainTextFile {

	public static void main(String[] args) throws IOException {
		File myFile = new File("abc.txt");
		System.out.println("FileExists: " + myFile.exists());
		System.out.println("IsAFile?: " + myFile.isFile());
		System.out.println("IsADirectory?: " + myFile.isDirectory());
		System.out.println("AbsolutePath: " + myFile.getAbsolutePath());
		System.out.println("LastModified?: " 
					+ new Date(myFile.lastModified()));
		System.out.println("FileName: " + myFile.getName());
		
		// true means append, false means overwrite.
		FileWriter fileWriter = new FileWriter(myFile, false);
		PrintWriter write = new PrintWriter(fileWriter);
		write.println("def");
		write.println("456");
		write.close();
	}
	
}
