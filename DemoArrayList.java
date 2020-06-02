package ArrayList;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> dem= new ArrayList<String>();
		dem.add("Amit");
		dem.add("I am a student");		
		System.out.println(dem);
		dem.add(0, "Student");
		System.out.println(dem);
		/*dem.remove(1);
		dem.remove("I am a student");
		dem.removeAll(dem);
		System.out.println(dem);*/
		dem.get(2);
		System.out.println(dem.get(2));
		
		System.out.print(dem.contains("I am a student"));
		
		System.out.print(dem.indexOf("Amit"));
		
		System.out.print(dem.isEmpty());
		
		System.out.print(dem.size());
		

	}

}
