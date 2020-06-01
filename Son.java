package Inheritence;

public class Son extends Grandfather {// data is getting from

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s = new Son();
		s.city();
		s.country();
		

		System.out.println(s);

	}

	public void school()

	{
		System.out.println("My School name is Belur High School");
	}

	public void College()

	{
		System.out.println("My College name is AOT");
	}

}
