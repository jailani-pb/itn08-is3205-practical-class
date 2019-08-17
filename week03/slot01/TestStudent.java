package week03.slot01;

public class TestStudent {

	/*
	 *  This is to show the difference between Instance variables
	 *	and Class variables.
	 */
//	public static void main(String[] args) {
//		Student student1 = new Student("18FTT123", "ABC", 2000);
//		Student student2 = new Student("18FTT789", "DEF", 1988);
//		
//		System.out.println(student1.studentDetails("student1:"));
//		System.out.println(student2.studentDetails("student2:"));
//		student1.name = "XYZ";
//		System.out.println(student1.studentDetails("student1:"));
//		System.out.println(student2.studentDetails("student2:"));
//		
//		System.out.println("student1: " + student1.noOfStudents);
//		System.out.println("student2: " + student2.noOfStudents);
//		student1.noOfStudents = 100;
//		System.out.println("student1: " + student1.noOfStudents);
//		System.out.println("student2: " + student2.noOfStudents);
//	}

	/*
	 * This implementations is to show:
	 * 1) You can access class variables without creating an object
	 * 		by using the ClassName.
	 * 2) The algorithm in Constructors is working.
	 * 3) The algorithm in Methods is working.
	 */
	public static void main(String[] args) {
		// out in System.out.println is another example of
		// constant class variable. Thats why you don't need
		// to create System object.
		System.out.println(Student.noOfStudents);
		Student student1 = new Student("18FTT123", "ABC", 2000, 'A');
		System.out.println(Student.noOfStudents);
		Student student2 = new Student("18FTT789", "DEF", 1988, 'B');
		System.out.println(Student.noOfStudents);
		Student student3 = new Student("18FTT456", "XYZ", 0, 'O');
		System.out.println(Student.noOfStudents);
		
		System.out.println(student1.studentDetails("student1:"));
		System.out.println(student1.calculateAge());
		
		System.out.println(student2.studentDetails("student2:"));
		System.out.println(student2.calculateAge());
		
		System.out.println(student3.studentDetails("student3:"));
		System.out.println(student3.calculateAge());
		
		/*
		 * Showing what you can do using class variables and
		 * constant class variables.
		 */
//		for(int i = 0; i < 10000; i++) {
//			if(Student.noOfStudents <= Student.MAX_STUDENTS) {
//				new Student("18FTT"+i, "Student"+i, i, 'A');
//				System.out.println(Student.noOfStudents);
//			} else {
//				System.out.println("Sudah Tah");
//				break;
//			}
//		}
	}
	
}







