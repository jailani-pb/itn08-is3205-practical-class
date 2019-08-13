package week06.slot01.abstraction;

public abstract class Shape2D {

	private String colour;
	
	public Shape2D(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
