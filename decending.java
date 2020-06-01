package seleniummay;

public class decending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = { 10, 97, 176, 11, 41, 59, 69 };
		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				// if (ar[i] > ar[j])-----------------Ascending
				if (ar[i] < ar[j])// ----------------Decending
				{
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.print(ar[i] + " ");
		}
		System.out.println();
	}

}
