package week04.slot01;

public class Player {

	private int id;
	public final String name;
	private int health = 100;
	private static int numberOfPlayer = 0;
	
	public Player(String name) {
		this.name = name;
		numberOfPlayer++;
		id = numberOfPlayer;
	}
	
	public int getId() {
		return id;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void reduceHealth(int damage) {
		if(damage > 0) {
			health = health - damage;
			if(health < 0) {
				health = 0;
			}
		}
	}
	
	public void increaseHealth(int heal) {
		if(heal > 0) {
			health = health + heal;
			if(health > 100) {
				health = 100;
			}
		}
	}
}




