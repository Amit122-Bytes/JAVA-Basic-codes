package seleniummay;

public class conditionalformating {

	public static void main(String[] args) {

		String seatstatus = "AC_Third_Class";

//		if (seatstatus.equals("AC_First_Class"))
//		{
//		System.out.println("Sorry no seat avaible at the moment");
//		}
//		else if (seatstatus.equals("AC_Second_Class")) {
////			System.out.println("Few seats are avabile, book your seats now");
//		//		} else if (seatstatus.equals("AC_Third_Class")) {
//
//			System.out.println("Avalable seats are 30,31,32,35");
//		}else if (seatstatus.equals("General_Compartment")) {
//      System.out.println("Reservation is ongoing, book your seats now ");
//		}
//		else
//		{System.out.println("Sorry not a valid input");
//		}
//		
		switch (seatstatus) {
		case "AC_First_Class":
			System.out.println("Sorry no seat avaible at the moment");
			break;

		case "AC_Second_Class":
			System.out.println("Few seats are avabile, book your seats now");
			break;

		case "AC_Third_Class":
			System.out.println("Avalable seats are 30,31,32,35");
			break;

		case "General_Compartment":
			System.out.println("Reservation is ongoing, book your seats now ");
			break;

		default:
			System.out.println("Sorry not a valid input");
		}

	}

}
