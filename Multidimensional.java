package Arrays;

public class Multidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Multidimesional Array a[row][coloum]

		int a[][] = new int[2][3];

		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;

		// int b[][]= {{2,4,5},{3,4,7}}.....; you can declare Multidimesion as well

		// System.out.println(a[1][0]);

		for (int i = 0; i < 2; i++)

		{
               for(int j=0; j<3;j++)
               {
            	   System.out.println(a[i][j]+ "");
               }
		} 

	}

}
