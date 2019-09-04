package week09.slot01.datastructures;

import java.util.Stack;

public class LearningStack {

	public static void main(String[] args) {
		Stack<String> abc = new Stack<String>();
		
		abc.push("A");
		abc.push("B");
		abc.push("C");
		abc.push("D");
		abc.push("E");
		System.out.println(abc);
		
		System.out.println(abc.peek());
		System.out.println(abc);
		System.out.println(abc.peek());
		System.out.println(abc);
		
		System.out.println(abc.pop());
		System.out.println(abc);
		
		while(!abc.isEmpty()) {
			System.out.println(abc.pop());
		}
		System.out.println(abc);
	}
	
}
