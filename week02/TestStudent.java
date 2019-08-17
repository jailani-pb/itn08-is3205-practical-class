package week02;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student("18FTT123", "ABC");
		Student student2 = new Student("18FTT789", "DEF");
		System.out.println("1: " + student1.id + " " + student1.name);
		System.out.println("2: " + student2.id + " " + student2.name);
		student1.id = "18FTT456";
		System.out.println("1: " + student1.id + " " + student1.name);
		System.out.println("2: " + student2.id + " " + student2.name);
		
		System.out.println(student1.attending(true));
		System.out.println(student2.attending(false));
	}
	
}
