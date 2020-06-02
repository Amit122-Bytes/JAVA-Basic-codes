package importantJavaCodes;

import java.io.File;

public class searchfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("I:\\");
	      String[] children = dir.list();
	      
	      if (children == null) {
	         System.out.println("does not exist or  is not a directory");
	      } else
	      
	      {
	         for (int i = 0; i < children.length; i++) {
	            String filename = children[i];
	            System.out.println(filename);
	         }
	      }

	}

}
