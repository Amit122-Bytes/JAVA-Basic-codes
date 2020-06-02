package importantJavaCodes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class file_size {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 Path path  = Paths.get("E:\\Photos\\Edited\\2.jpg"); 

     // get File Size 

     long result; 

     result = Files.size(path); 

     System.out.println("File " + path   + " Size = " + result + " bytes"); 

	}

}
