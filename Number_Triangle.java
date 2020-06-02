package importantJavaCodes;

import java.util.Scanner;

public class Number_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int rows;
		 Scanner js= new Scanner(System.in);
		 System.out.print("Enter the number");
		 rows=js.nextInt();

	        for(int i = 1; i <= rows; ++i) {
	            for(int j = 1; j <= i; ++j) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		
		
	}

}
