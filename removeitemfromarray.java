package importantJavaCodes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeitemfromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String removeElem = "TestNG";
		List myList = new ArrayList();
		myList.add("JAVA");
		myList.add("TestNG");
		myList.add("Selenium");
		myList.add("Appium");
		myList.add("Testing");
		System.out.println("Before remove :");
		System.out.println(myList);
		Iterator itr = myList.iterator();

		while (itr.hasNext()) {

			if (removeElem.equals(itr.next())) {

				itr.remove();
			}
		}

		System.out.println("After remove :");
		System.out.println(myList);

	}

}
