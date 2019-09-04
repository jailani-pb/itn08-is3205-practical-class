package week07.slot01.datastructures;

import java.util.ArrayList;

import week05.slot01.encapsulation.Animal;

public class LearningArrayList {

	public static void main(String[] args) {
//		// To store int data type
//		ArrayList<Integer> ageList = new ArrayList<Integer>();
//		// To store Animal data type
//		ArrayList<Animal> animalList = new ArrayList<Animal>();
		// To store String data type
		ArrayList<String> nameList = new ArrayList<String>();
		System.out.println(nameList);
		System.out.println(nameList.isEmpty());
		
		nameList.add("A");
		System.out.println(nameList);
		System.out.println(nameList.isEmpty());
		
		nameList.add("B");
		nameList.add("C");
		System.out.println(nameList);
		
		nameList.add(0, "D");
		System.out.println(nameList);
		
		nameList.add(2, "F");
		System.out.println(nameList);
		
//		nameList.add(6, "E");
		System.out.println(nameList.size());
		nameList.add(nameList.size(), "E");
		System.out.println(nameList);
		
		nameList.remove(nameList.size()-1);
		System.out.println(nameList);
		
		nameList.remove(2);
		System.out.println(nameList);
		
		nameList.remove("D");
		System.out.println(nameList);
		
		nameList.set(0, "G");
		System.out.println(nameList);
		
		System.out.println(nameList.get(0));
		String tempData = nameList.get(1);
		System.out.println(tempData);
	}
	
}





