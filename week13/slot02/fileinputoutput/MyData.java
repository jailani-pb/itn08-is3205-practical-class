package week13.slot02.fileinputoutput;

public class MyData {

	int id;
	String data1;
	String data2;
	
	public MyData(int id, String data1, String data2) {
		this.id = id;
		this.data1 = data1;
		this.data2 = data2;
	}

	@Override
	public String toString() {
		return "MyData [id=" + id + ", data1=" + data1 + ", data2=" + data2 + "]";
	}
	
}
