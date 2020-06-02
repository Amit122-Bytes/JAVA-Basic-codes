package importantJavaCodes;

import java.util.Scanner;

public class Reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, reversed = 0;
		Scanner bs=new Scanner(System.in);
		System.out.print("Enter the number");
		num=bs.nextInt();

		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}

		System.out.println("Reversed Number: " + reversed);

	}

}
