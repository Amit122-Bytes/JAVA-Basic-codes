package seleniummay;

public class varibaleanddatatypes {// Using== int,char,float,byte,short,long

	public static void main(String[] args) {
		int a = 25;
		int b = 32;
		char ch = 'A';
		System.out.println("FIrst sum is = " + (a + b));// two integer sum
		int x = a + b;
		System.out.println("Second Sum is = " + (x + ch));// int+character
		int y = a + b + ch;
		System.out.println("Third Sum is = " + (x + y));//Int+character+int
		float num1=27.50f;
		float num2=35.50f;
		int z= x+y;
		System.out.println("Fourth SUm is ="+ (num1+num2+z));//float+interger
		float d= num1+num2+z;
		System.out.println("Fifth sum is= "+(d+z+x+y+x));//float+integer+character
		float s=d+z+x+y+x;
		byte myNum=100;
		System.out.println("Sixth sum is ="+(myNum+s));//byte+float
		float g=myNum+s;
		long myNum2=500;
		System.out.println("Seventh Sum is ="+ (g+myNum2));//long+float
		float u=g+myNum2;
		short myNum3=500;
		System.out.println("FInal Output is = "+(u+myNum3));//
	}

}
