package week13.slot02.fileinputoutput;

import java.io.FileNotFoundException;

public class DataManagementTest {

	public static void main(String[] args) throws FileNotFoundException {
		DataManagement dm = new DataManagement();
//		dm.dataList.add(new MyData(1, "a", "f"));
//		dm.dataList.add(new MyData(2, "b", "g"));
//		dm.dataList.add(new MyData(3, "c", "h"));
//		dm.dataList.add(new MyData(4, "d", "i"));
//		dm.dataList.add(new MyData(5, "e", "j"));
//		dm.saveToFile("mydata.xml");
		dm.loadFromFile("mydata.xml");
		System.out.println(dm.dataList);
	}
	
}




