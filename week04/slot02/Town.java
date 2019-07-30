package week04.slot02;

public class Town {
	
	private Player player;
	private NonPlayableCharacter[][] npcs;
	
	public Town(int width, int height) {
		npcs = new NonPlayableCharacter[width][height];
	}
	
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	private boolean checkCoordinate(int x, int y) {
		if(x >= 0 && x < npcs.length && y >= 0 && y < npcs[0].length) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean addNPC(NonPlayableCharacter npc, int x, int y) {
		if(checkCoordinate(x, y)) {
			npcs[x][y] = npc;
			return true;
		} else {
			return false;
		}
	}
	
	public String interactWithNPC(int x, int y) {
		if(checkCoordinate(x, y)) {
			NonPlayableCharacter targetNPC = npcs[x][y];
			if(targetNPC != null) {
				return targetNPC.talk(player);
//				return player.interact(targetNPC);
			} else {
				return "Siuk sendiri kau disana!";
			}
		} else {
			return "Limpar tampat kan kau aga atu!";
		}
	}
	
}



