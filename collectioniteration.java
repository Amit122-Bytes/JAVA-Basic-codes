package importantJavaCodes;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class collectioniteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new LinkedList<>();
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
		
		// Getting Iterator
		Iterator<String> namesIterator = names.iterator();
			
		// Traversing elements
		while(namesIterator.hasNext()){
			System.out.println(namesIterator.next());
			
		}
		
	}

}