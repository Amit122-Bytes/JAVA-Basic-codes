package importantJavaCodes;

import java.util.Scanner;

public class Average_and_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a , b , sum;
		float avg;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the first number");
		a=in.nextInt();
		
		System.out.println("Enter the Second number");
		b=in.nextInt();
		
		sum=a+b;
		avg=(float)((a+b)/2);
		
	    System.out.print("Sum : "+sum+"\nAverage: "+avg);
	    //System.out.print(avg);
		
		
		
	}

}
