package Superkeymethod;

public class Child extends Parent {

	String inst = "QA Academy";

	public Child()

	{   
		super();// this should always be in the first line
		System.out.println("Child class constructor");
	}

	public void getStringData()

	{
		System.out.println(inst);
		System.out.println(super.inst);
	}

	public void getData() {
		super.getData();
		System.out.println("I am Child class");// first pereference is always local class, then its print parent
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub// first pereference is always local class

		Child cd = new Child();
		cd.getStringData();
		cd.getData();

	}

}
