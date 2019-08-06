package week05.slot01.inheritance;

import week05.slot01.encapsulation.Animal;

public class Lion extends Animal {

	protected static int noOfLions = 0;
	
	public Lion(String name) {
		super(name);
		noOfLions++;
		noOfAnimals++;
	}
	
	public String hunt() {
		return name + " is hunting.";
	}

}
