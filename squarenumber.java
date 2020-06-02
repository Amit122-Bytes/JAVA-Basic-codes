package importantJavaCodes;

import java.util.Scanner;

public class squarenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, m, s;

		// Declare input as scanner
		Scanner input = new Scanner(System.in);

		// Take input
		System.out.println("Enter Number :");
		no = input.nextInt();

		// add while loop
		while (no > 0) 
		
		{
			m = no % 10;
			s = m * m;
			System.out.println("Square of " + m + " is " + s);
			no = no / 10;
		}
	}

}
