package importantJavaCodes;

import java.util.Arrays;

public class array_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] array1 = {1, 2, 3};
	      int[] array2 = {1, 2, 3};

	      System.out.println("Arrays: array1 = [1, 2, 3], array 2 = [1, 2, 3]");
	      //Scenario 1 : Comparing using ==
	      System.out.println("== results: " + (array1 == array2));

	      //Scenario 2 : Comparing using Arrays.equals()
	      System.out.println("Arrays.equals() results: " + Arrays.equals(array1,array2));

	      Object[] objArray1 = {array1};
	      Object[] objArray2 = {array2};

	      System.out.println("Arrays: objArray1 = {array1}, objArray1 = {array2}");
	      //Scenario 3 : Comparing using Arrays.equals()
	      System.out.println("Arrays.equals() results: " + Arrays.equals(objArray1,objArray2));

	      //Scenario 4 : Comparing using Arrays.deepEquals()
	      System.out.println("Arrays.deepEquals() results: " + Arrays.deepEquals(objArray1,objArray2));
	}

	}


