package week05.slot01.inheritance;

import week05.slot01.encapsulation.Animal;

public class Elephant extends Animal {

	protected static int noOfElephants = 0;
	
	public Elephant(String name) {
		super(name);
		noOfElephants++;
		noOfAnimals++;
	}
	
	public String play() {
		return name + " is playing.";
	}

}




