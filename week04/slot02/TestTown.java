package week04.slot02;

public class TestTown {

	public static void main(String[] args) {
		Player player1 = new Player("ABC");
		NonPlayableCharacter npc1 = new NonPlayableCharacter("A", 10);
		NonPlayableCharacter npc2 = new NonPlayableCharacter("B", 5);
		
		populateDialogs(npc1, 10, "Ha");
		populateDialogs(npc2, 5, "Ho");
//		System.out.println(player1.interact(npc1));
		
		Town town1 = new Town(3, 4);
		town1.addNPC(npc1, 2, 1);
		town1.addNPC(npc2, 2, 3);
		town1.setPlayer(player1);
		
		System.out.println(town1.interactWithNPC(2, 1));
		System.out.println(town1.interactWithNPC(0, 0));
		System.out.println(town1.interactWithNPC(0, 100));
		System.out.println(town1.interactWithNPC(2, 3));
	}
	
	public static void populateDialogs
			(NonPlayableCharacter npc, int numberDialogs, String letter) {
		for(int i = 0; i < numberDialogs; i++) {
			String dialog = letter;
			for(int j = 0; j < i; j++) {
				dialog = dialog + letter;
			}
			npc.addDialog(dialog);
		}
	}
	
}
