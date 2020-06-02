package importantJavaCodes;

public class compare_two_strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String string1 = new String("Geeksforgeeks"); 
	        String string2 = new String("Practice"); 
	        String string3 = new String("Geeks"); 
	        String string4 = new String("Geeks"); 
	        String string5 = new String("geeks"); 
	  
	        // Comparing for String 1 != String 2 
	        System.out.println("Comparing " + string1 + " and " + string2 
	                           + " : " + string1.equals(string2)); 
	  
	        // Comparing for String 3 = String 4 
	        System.out.println("Comparing " + string3 + " and " + string4 
	                           + " : " + string3.equals(string4)); 
	  
	        // Comparing for String 4 != String 5 
	        System.out.println("Comparing " + string4 + " and " + string5 
	                           + " : " + string4.equals(string5)); 
	  
	        // Comparing for String 1 != String 4 
	        System.out.println("Comparing " + string1 + " and " + string4 
	                           + " : " + string1.equals(string4)); 
	}

}
