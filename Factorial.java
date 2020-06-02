package importantJavaCodes;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, fact = 1;
		int number;// It is the number to calculate factorial

		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Number");
		number=myObj.nextInt();
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

}
