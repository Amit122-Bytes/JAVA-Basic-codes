package seleniummay;

public class variablesexample {

	public static void main(String[] args) {
		
		
		String e="100";
		char c= 'B';
		System.out.println(c);
		int f=Integer.valueOf(e);
		double g=Double.valueOf(e);
		float h=Float.valueOf(e);
		c=Character.valueOf('A');
		System.out.println(c);
		
		System.out.println(e);
		System.out.println(e+((Object)f).getClass().getName());
		System.out.println(f+((Object)f).getClass().getName());
		System.out.println(g+((Object)f).getClass().getName());
		System.out.println(h+((Object)f).getClass().getName());
		System.out.println(c+((Object)f).getClass().getName());

	}

}
