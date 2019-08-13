package week06.slot01.abstraction;

public class Square extends Shape2D {

	private double side;

	public Square(String colour, double side) {
		super(colour);
		setSide(side);
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;
		if(this.side < 0) {
			this.side = 0;
		}
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}
	
}
