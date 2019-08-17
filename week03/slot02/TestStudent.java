package week03.slot02;

//import week3.slot1.Student;

public class TestStudent {

	public static void main(String[] args) {
//		week3.slot1.Student student1 = 
//				new week3.slot1.Student("18FTT123", "ABC", 2001, 'A');
//		week2.Student student2 = new week2.Student("18FTT789", "DEF");
//		System.out.println(student2.id);
//		week3.slot2.Student student3 = 
//				new week3.slot2.Student("18FTT123", "ABC");
		
		Student student1 = new Student("ABC", "DEF");
		System.out.println(student1.getId() + " " + student1.getName());
		student1.setId("1234567890");
		System.out.println(student1);
	}
	
}
