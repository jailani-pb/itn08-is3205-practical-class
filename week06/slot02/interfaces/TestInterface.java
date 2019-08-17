package week06.slot02.interfaces;

public class TestInterface {

	public static void main(String[] args) {
		Clickable clickable = new Circle("RED", 1.5);
		clickable.click();
		
		clickable = new Picture("MyPicture.jpg");
		clickable.click();
		
		// Rectangle does not implements Clickable
		// Cannot reference Rectangle object using Clickable variable.
//		clickable = new Rectangle("GREEN", 5.5, 7.7);
	}
	
}
