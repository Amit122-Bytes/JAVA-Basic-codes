package seleniummay;

public class triangle {

	public static void main(String[] args) {
		
           for(int i=1;i<=4;i++)// for space
           {
        	   for(int j=4;j>=i;j--) 
        	   {
        		   System.out.print(" ");
        	   }
        	   
        	   for (int k=1;k<=i;k++) // for row
        	   {
        		   System.out.print("*");
        	   }
        	   
        	   for(int l=2;l<=i;l++)// for coloum
        	   {
        		   System.out.print("*");
        	   }
        	   
        	   System.out.println("");
           } 
          
	}

}
