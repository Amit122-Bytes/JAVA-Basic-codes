package Arrays;

public class usingbreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int c[]= {2,5,8,7,4,6,3};
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
			if(c[i]==7)
			{
				break;//if we don't use break it's print all the data after 7
			}
		}

	}

}
