package week05.slot02.encapsulation;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal("ABC");
		// Encapsulated instance variable, hungerLevel
		// No direct access
//		System.out.println(animal1.hungerLevel);
		// Can only be accessed through accessor (getter)
		// and the mutator (setter) method
		System.out.println(animal1.getHungerLevel());
		animal1.setHungerLevel(999);
		System.out.println(animal1.getHungerLevel());
		// Can directly access protected members
		// Animal class is in the same package.
		System.out.println(Animal.noOfAnimals);
	}
	
}
