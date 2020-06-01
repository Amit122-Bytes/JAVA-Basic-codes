package Setinterface;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>(); 
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");// Set Rejected the duplicate value and ArrayList print both the values
		hs.add("He");
		hs.add("She");
		System.out.println(hs);
		
		//remove,isEmpty is same for Arraylist
		
		//Iterator
		
	    Iterator<String> i=hs.iterator();
	    while(i.hasNext())
	    {
	    	System.out.println(i.next());//check notes
	    }
		

	}

}
