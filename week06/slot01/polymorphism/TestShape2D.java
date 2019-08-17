package week06.slot01.polymorphism;

import week06.slot01.abstraction.*;

public class TestShape2D {

	public static void main(String[] args) {
		Shape2D shape1 = new Circle("RED", 15.5);
		System.out.println(shape1);
		shape1 = new Rectangle("BLUE", 12.4, 13.9);
		System.out.println(shape1);
		shape1 = new Square("GREEN", 14.5);
		System.out.println(shape1);
		
		Shape2D[] shapes = new Shape2D[3];
		shapes[0] = new Circle("RED", 15.5);
		shapes[1] = new Rectangle("BLUE", 12.4, 13.9);
		shapes[2] = new Square("GREEN", 14.5);
		
		for(int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i] + " " + shapes[i].getArea());
		}
		
//		System.out.println(shapes[0].getRadius());
		((Circle) shapes[0]).getRadius();
		System.out.println(((Circle) shapes[0]).getRadius());
		
//		((Square) shapes[1]).getSide();
		
		for(int i = 0; i < shapes.length; i++) {
			if(shapes[i] instanceof Circle) {
				System.out.println(shapes[i] + " " 
						+ ((Circle) shapes[i]).getRadius());
			}
			if(shapes[i] instanceof Rectangle) {
				System.out.println(shapes[i] + " "
						+ ((Rectangle) shapes[i]).getLength() + " "
						+ ((Rectangle) shapes[i]).getHeight());
			}
			if(shapes[i] instanceof Square) {
				System.out.println(shapes[i] + " "
						+ ((Square) shapes[i]).getSide());
			}
		}
	}
	
}



