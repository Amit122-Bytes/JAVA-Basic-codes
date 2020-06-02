package importantJavaCodes;

import java.io.FileWriter;
import java.io.IOException;

public class writetext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter myWriter = new FileWriter("I:\\ID.txt");
			myWriter.write("Baba maa bon amar family!");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e)

		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
