package week07.slot01.datastructures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LearningLinkedList {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		
		nameList.add("A");
		nameList.add("B");
		nameList.add("C");
		nameList.addFirst("D");
		nameList.addFirst("E");
		
		ListIterator<String> listIterator = nameList.listIterator();
		
		System.out.println(nameList);
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
		System.out.println(listIterator.next());
//		System.out.println(listIterator.next());
		if(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		listIterator.next();
		listIterator.next();
		
		listIterator.add("F");
		System.out.println(nameList);
		
		listIterator.next();
		listIterator.remove();
		System.out.println(nameList);
		
//		listIterator.remove();
		
		listIterator.previous();
		listIterator.set("G");
		System.out.println(nameList);
		
//		listIterator.set("H");
		
		System.out.println(nameList.get(4));
		nameList.remove(4);
		nameList.set(3, "I");
		nameList.add(2, "J");
		System.out.println(nameList);
	}
	
}






