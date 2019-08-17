package week06.slot02.interfaces;

public class Picture implements Movable, Clickable {

	public String fileName;
	
	public Picture(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void click() {
		System.out.println("Picture with file name, " + fileName +
				" is clicked.");
	}

	@Override
	public void move() {
		System.out.println("Picture with file name, " + fileName +
				" is moved.");
	}
	
}
