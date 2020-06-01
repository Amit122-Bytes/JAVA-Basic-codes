package seleniummay;

public class indexnumber {

	public static void main(String[] args) {
		
		String[] Games= {"Cricket","Football","BasketBall","Golf","Hockey","Tennis","Boking"};
		int index=0;
		for(int i=0;i<Games.length;i++)
		{
			if(Games[i]=="Hockey")
			{
				index=i;
			}
		}
		System.out.println("Postion of Game is = "+index);
	}

}
