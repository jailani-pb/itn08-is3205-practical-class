package week04.slot02;

public class TestGame {

	public static void main(String[] args) {
		Player player1 = new Player("ABC");
		NonPlayableCharacter npc1 = new NonPlayableCharacter("A", 10);
		NonPlayableCharacter npc2 = new NonPlayableCharacter("B", 5);
		
		for(int i = 0; i < 10; i++) {
			String dialog = "A";
			for(int j = 0; j < i; j++) {
				dialog = dialog + "A";
			}
			npc1.addDialog(dialog);
		}
		for(int i = 0; i < 5; i++) {
			String dialog = "B";
			for(int j = 0; j < i; j++) {
				dialog = dialog + "B";
			}
			npc2.addDialog(dialog);
		}
		
		System.out.println("player1 interact with npc1");
		System.out.println(player1.interact(npc1));
		System.out.println("player1 interact with npc2");
		System.out.println(player1.interact(npc2));
		
		System.out.println("player1 attack npc2");
		player1.attack(npc2);
		System.out.println("npc1 health: " + npc1.getHealth());
		System.out.println("npc2 health: " + npc2.getHealth());
		
		System.out.println("player1 interact with npc1");
		System.out.println(player1.interact(npc1));
		System.out.println("player1 interact with npc2");
		System.out.println(player1.interact(npc2));
		
		player1.interact(null);
	}
	
}



