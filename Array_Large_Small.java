package seleniummay;

public class Array_Large_Small {

	public static void main(String[] args) {

		int numArray[] =  { 7, 27, 17, 45, 23, 5 };

		int smaller = numArray[0];
		int larger = numArray[0];

		for (int i = 1; i < numArray.length; i++) {

			if (numArray[i] > larger) {
				larger = numArray[i];

			} else if (numArray[i] < smaller) {
				smaller = numArray[i];

			}
		}
		System.out.println("The Larger Number is:" + larger);
		System.out.println("The Smaller Number is:" + smaller);
	}

}
