package week09.slot01.datastructures;

import java.util.*;

public class LearningQueue {

	public static void main(String[] args) {
		Queue<String> abc = new LinkedList<String>();
		
		abc.offer("A");
		abc.offer("B");
		abc.offer("C");
		abc.offer("D");
		abc.offer("E");
		System.out.println(abc);
		
		System.out.println(abc.peek());
		System.out.println(abc);
		System.out.println(abc.peek());
		System.out.println(abc);
		
		System.out.println(abc.poll());
		System.out.println(abc);
		
		while(!abc.isEmpty()) {
			System.out.println(abc.poll());
		}
		System.out.println(abc);
	}
	
}
