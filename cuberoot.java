package importantJavaCodes;

import java.util.Scanner;

public class cuberoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no,m,c;

		//Declare input as scanner
		Scanner input = new Scanner(System.in);

		//Take input
		System.out.println("Enter Number :");
		no = input.nextInt();

		//add while loop
		while(no>0)
		{
		m=no%10;
		c = m*m*m;
		System.out.println("Cube of "+m+" is "+c);
		no=no/10;
		}
		
		

	}

}
