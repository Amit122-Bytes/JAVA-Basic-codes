package importantJavaCodes;

import java.util.Scanner;

public class small_and_large_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the num");
		Scanner a = new Scanner(System.in);
		int x = a.nextInt();
		int y = a.nextInt();
		int z = a.nextInt();
		int x1 = a.nextInt();

		int[] arr = { x, y, z, x1 };

		int large = arr[0];
		int small = arr[0];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "==" + large);
			if (arr[i] > large) {
				large = arr[i];
			}
			if (arr[i] < small) {
				small = arr[i];
			}

		}

		System.out.println("Lareg Num:" + large + "=Small Num=" + small);

	}

}
