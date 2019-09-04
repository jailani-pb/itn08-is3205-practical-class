package week09.slot01.datastructures;

import java.util.*;

public class LearningSets {

	public static void main(String[] args) {
		HashSet<String> icNumbers = new HashSet<String>();
//		LinkedHashSet<String> icNumbers = new LinkedHashSet<String>();
//		TreeSet<String> icNumbers = new TreeSet<String>();
		
		icNumbers.add("00123456");
		icNumbers.add("51234567");
		icNumbers.add("30555666");
		icNumbers.add("01554433");
		icNumbers.add("51234567");
		System.out.println(icNumbers);
		
		System.out.println(icNumbers.contains("00123456"));
		System.out.println(icNumbers.contains("00987654"));
		
		icNumbers.remove("01554433");
		System.out.println(icNumbers);
		
		for(String e : icNumbers) {
			System.out.println(e);
		}
	}
	
}



