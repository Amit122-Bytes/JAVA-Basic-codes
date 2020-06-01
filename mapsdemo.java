package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class mapsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(0, "Amit");
		hs.put(1, "Asim");
		hs.put(2, "Sampa");
		hs.put(3, "Shikha");
		//System.out.println(hs.get(3));// if you put get(5) it will return false becuase 5 is not an interge for this codes
		
		//remove, isEmpty is same for this
		
		//Iterator-Covert map to set
		
		Set ms=hs.entrySet();
		Iterator it=ms.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
	}

}
