package DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/YYYY");
		SimpleDateFormat sd=new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");// Month is alway Capital
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
	}

}
