package Arrays;

public class sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sum of number in the array

		int sum = 0;
		int c[] = { 2, 5, 6, 7, 8 };
		
		for(int i=0;i<c.length;i++)// 5 times
		{
			sum=sum+c[i];
		}
		
		System.out.println(sum);
	}

}
