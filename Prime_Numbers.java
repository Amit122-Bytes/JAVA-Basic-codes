package importantJavaCodes;

import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner ts= new Scanner(System.in);
		System.out.print("Enter the number");
		num=ts.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
