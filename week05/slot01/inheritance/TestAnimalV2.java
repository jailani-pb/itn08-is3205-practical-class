package week05.slot01.inheritance;

import week05.slot01.encapsulation.Animal;

public class TestAnimalV2 {

	public static void main(String[] args) {
		// Animal is in different package as this class.
		// Cannot directly access members with protected keyword.
//		System.out.println(Animal.noOfAnimals);
		
		Lion lion1 = new Lion("ABC");
		// Lion is a subclass of Animal.
		// All visible class's members in Animal is inherited.
		System.out.println(lion1.name);
		System.out.println(lion1.getHungerLevel());
		lion1.setHungerLevel(999);
		System.out.println(lion1.getHungerLevel());
		System.out.println(lion1.eat());
		// Invoke its own method
		System.out.println(lion1.hunt());
		// Cannot invoke its sibling's method (Elephant's play())
//		System.out.println(lion1.play());
		
		Elephant elephant1 = new Elephant("DEF");
		// Elephant is a subclass of Animal.
		// All visible class's members in Animal is inherited.
		System.out.println(elephant1.name);
		System.out.println(elephant1.getHungerLevel());
		elephant1.setHungerLevel(999);
		System.out.println(elephant1.getHungerLevel());
		System.out.println(elephant1.eat());
		// Invoke its own method
		System.out.println(elephant1.play());
		// Cannot invoke its sibling's method (Lion's hunt())
//		System.out.println(elephant1.hunt());
	}
	
}
