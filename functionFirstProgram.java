package seleniummay;

public class functionFirstProgram {

	public static void main(String[] args) {

		newone();
		newtwo();
	}
	//-------------------------------------------First Method--------------------------------- //
	
	public static int newone()// Fibonaci Series
	{
		int firstNum = 0, secondNum = 1, sumofTwo = 0;

		for (int i = 0; i <= 10; i++) {
			sumofTwo = firstNum + secondNum;
			System.out.println(sumofTwo);
			firstNum = secondNum;
			secondNum = sumofTwo;	
		}
		System.out.println("------------------------------------------------------------");
		return sumofTwo;
	}
	//-------------------------------------------Second Method--------------------------------- //
	public static void newtwo() {
		
		for (int row = 9; row >= 1; row = row-2) 
		{
			for (int col = 1; col <= row; col = col+2) {
				System.out.print(col);
			}
				System.out.println();
		}
		for (int row = 1; row <= 9; row = row+2) 
		{
			for (int col = 1; col <= row; col = col+2) {
				System.out.print(col);
			}
				System.out.println();
		}
	}
}
