package week05.slot01.encapsulation;

public class Animal {

	public String name;
	private int hungerLevel;
	protected static int noOfAnimals = 0;
	
	public Animal(String name) {
		this.name = name;
		this.setHungerLevel(0);
	}
	
	public int getHungerLevel() {
		return hungerLevel;
	}
	
	public void setHungerLevel(int hungerLevel) {
		this.hungerLevel = hungerLevel;
		if(this.hungerLevel < 0) {
			this.hungerLevel = 0;
		}
		if(this.hungerLevel > 150) {
			this.hungerLevel = 150;
		}
	}
	
	public String eat() {
		return name + " is eating.";
	}
	
}







