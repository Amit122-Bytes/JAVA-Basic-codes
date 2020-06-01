package StringHandling;

public class ReverseString {

	public static void main(String[] args) {

		String s = "AmitMetaPrasannaSumanPV";
		String t = "";

		for (int i = s.length() - 1; i >= 0; i--) {// Reverse String
			t = t + s.charAt(i);
		}
		System.out.println(t);

		if (s == t) {// This is logic for Plaindrome
			System.out.println("This is Plaindrome");
		}

		else {
			System.out.println("This is not Palindrome");
		}

	}

}
