package methodpractice;

public class overloadingdata {

	public static void main(String[] args) {
		
		operations ovr= new operations();
		
		System.out.println("Multiplication of two number: "+ ovr.multiplication(20, 40));
		System.out.println("Multiplication of three number: "+ ovr.multiplication(10, 20, 30));
	}

}
