package week13.slot01.fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlingException {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		while(true) {
			System.out.println("File? q to exit");
			String inputString = userInput.nextLine();
			
			if(inputString.equalsIgnoreCase("q")) {
				break;
			}
			
			File file = new File(inputString);
			try {
				Scanner readFile = new Scanner(file);
				while(readFile.hasNextLine()) {
					System.out.println(readFile.nextLine());
				}
				readFile.close();
			} catch (FileNotFoundException e) {
//				e.printStackTrace();
				System.out.println("File not found!");
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("Ada Masalah!");
			}
		}
		
		userInput.close();
	}
	
}
