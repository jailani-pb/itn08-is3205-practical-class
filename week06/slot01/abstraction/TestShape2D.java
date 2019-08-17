package week06.slot01.abstraction;

public class TestShape2D {

	public static void main(String[] args) {
		// Shape2D is an abstract class.
		// Cannot create an instance of an abstract class.
//		Shape2D shape1 = new Shape2D("RED");
		
		Circle circle1 = new Circle("RED", 15.5);
		Square square1 = new Square("BLUE", 2.4);
		Rectangle rectangle1 = new Rectangle("GREEN", 20.3, 15.5);
	}
	
}
