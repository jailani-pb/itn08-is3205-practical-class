package week09.slot01.datastructures;

import java.util.*;

public class LearningMaps {

	public static void main(String[] args) {
//		HashMap<String, String> students =
//				new HashMap<String, String>();
//		LinkedHashMap<String, String> students =
//				new LinkedHashMap<String, String>();
		TreeMap<String, String> students =
				new TreeMap<String, String>();
		
		students.put("1231", "Abdul");
		students.put("1111", "Rahman");
		students.put("4361", "Jailani");
		students.put("3211", "Mohammad");
		students.put("8901", "Haji");
		System.out.println(students);
		
		if(!students.containsKey("1231")) {
			students.put("1231", "Abd");			
		} else {
			System.out.println("Ada sudah 1231");
		}
		System.out.println(students);
		
		System.out.println(students.get("4361"));
		
		students.remove("1111");
		System.out.println(students);
		
		students.remove("4361", "Jai");
		System.out.println(students);
		
		students.replace("3211", "Mohd");
		System.out.println(students);
		
		students.replace("5555", "Mohd");
		System.out.println(students);
		
		students.replace("3211", "ABC", "Md");
		System.out.println(students);
		
		System.out.println(students.keySet());
		System.out.println(students.values());
	}
	
}




