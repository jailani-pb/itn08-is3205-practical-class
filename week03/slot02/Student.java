package week03.slot02;

public class Student {

	private String id;
	private String name;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(id.length() > 8) {
			this.id = id.substring(0,8);
		} else {
			this.id = id;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
