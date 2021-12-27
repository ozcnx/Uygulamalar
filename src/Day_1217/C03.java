package Day_1217;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C03 {

	public static void main(String[] args) {
		
		List<Integer> Liste = new ArrayList<Integer>();
		Liste.add(5);
		Liste.add(3);
		Liste.add(2);
		Liste.add(7);
		Liste.add(9);
		Liste.add(2);
		
		System.out.println(Liste);
		
		Iterator ite2=Liste.iterator();
		
		ite2.next();
		ite2.next();
		ite2.next();
		
		System.out.println(ite2.next());//7
		
		
		ite2.remove();
		//System.out.println(ite2.remove());
		System.out.println(Liste);
		
	}

}
