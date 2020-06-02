package Construct;

public class constructDemon { // Default 
	
	//public constructDemon()
	{
		
		System.out.println(" I am in the constructor");
		System.out.println(" I am in the constructor lecture 1"); //
	} // Parameterized constructor

	public constructDemon(int a, int b)
	{
		System.out.println(" I am in the parameterized constructor");
		int c = a + b;
		System.out.println(c);
	}

	public constructDemon(String str) 
	{
		System.out.println(str);
	}

	public void getdata()
	{
		System.out.println("I am the method");
		
	} // will not return values //name of constructor should be the class name


   public static void main(String[] args)
     { 
	// TODO Auto-generated method stub 
//	constructDemon cd= new constructDemon(null); 
//	constructDemon cds= new constructDemon("hello"); 
//	constructDemon c= new constructDemon(4,5); // compiler will call implict constructor if you have not defined constructor block //when ever you create an object constructor is called //block of code when ever an object is created 
	}

}