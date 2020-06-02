package importantJavaCodes;

import java.util.Scanner;

public class Mximum_of_3No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a:");
		a = in.nextInt();

		System.out.print("Enter b:");
		b = in.nextInt();

		System.out.print("Enter c:");
		c = in.nextInt();

		if (a > b & a > c) {

			System.out.print("a is big number");
		}

		else if (b > a & b > c) {

			System.out.print("b is big number");

		}

		System.out.print("c is big number");

	}

}
