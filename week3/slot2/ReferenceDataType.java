package week3.slot2;

public class ReferenceDataType {

	public static void main(String[] args) {
		// Review on primitive data types
		// double, float, long, int, short, byte
		// char, boolean
		// This will store the value directly with the variable.
		int i = 100;
		boolean isItTrue = false;
		// This is reference data types
		// It can be String, Scanner, Student or any class.
		// This will not store the value directly with the variable.
		// The variable will store the reference value to the
		// memory location.
		String name = "Jailani";
		String name2 = "Jailani";
		String name3 = new String("Jailani");
		// This output true because String is immutable
		System.out.println(name == name2);
		// This output false because we force String to create
		// another String object, that means name and name3 refer to
		// different String objects.
		System.out.println(name == name3);
		
		// Created three reference data type variables and
		// assigned week3.slot2.Student objects.
		Student student1 = new Student("18FTT123", "ABC");
		Student student2 = new Student("18FTT789", "DEF");
		// This will not make a copy of the week3.slot2.Student object.
		// It will copy the reference value stored in student2
		// into student3
		Student student3 = student2;
		
		/*	
		 * 	NOTE: Commenting the following due to covering
		 *	access modifier and instance variables id and
		 *	name in week3.slot2.Student class are declared
		 *	with private access modifier.
		 */
		// This is to show that student2 and student3
		// is refering to the same object.
//		System.out.println("student1: " + student1.name);
//		System.out.println("student2: " + student2.name);
//		System.out.println("student3: " + student3.name);
//		student2.name = "XYZ";
//		System.out.println("student1: " + student1.name);
//		System.out.println("student2: " + student2.name);
//		System.out.println("student3: " + student3.name);
		/*
		 * Fixed using Accessors (getters) and Mutators (setters)
		 * methods.
		 */
		System.out.println("student1: " + student1.getName());
		System.out.println("student2: " + student2.getName());
		System.out.println("student3: " + student3.getName());
		student2.setName("XYZ");
		System.out.println("student1: " + student1.getName());
		System.out.println("student2: " + student2.getName());
		System.out.println("student3: " + student3.getName());
		
		// This will remove the reference of the Student object 
		// from student1.
		student1 = null;
		// Since the Student object is no longer have any 
		// variable referring to it. Java will consider that object
		// as garbage. It will start the garbage collection process.
		// It will remove garbage to clear up memory for other objects
		// to use.
	}
	
}
