package week02;

public class Student {

	protected String id;
	String name;
	
	public Student(String sId, String sName) {
		id = sId;
		name = sName;
	}
	
	public String attending(boolean attend) {
		if(attend) {
			return id + " " + name + " is attending.";
		} else {
			return id + " " + name + " is absent.";
		}
	}
}








