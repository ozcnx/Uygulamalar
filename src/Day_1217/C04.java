package Day_1217;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04 {

	public static void main(String[] args) {
		//Itereter kullanarak tüm elemetleri siliniz
		
		List<Integer> Liste = new ArrayList<Integer>();
		Liste.add(5);
		Liste.add(3);
		Liste.add(2);
		Liste.add(7);
		Liste.add(9);
		Liste.add(2);
		
		System.out.println(Liste);
		
		Iterator ite1=Liste.iterator();
		
	
	while (ite1.hasNext());{
	ite1.next();
	ite1.remove();
		
	}

		System.out.println(Liste);
}
}