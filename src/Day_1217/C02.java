package Day_1217;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C02 {

	public static void main(String[] args) {
		
		List<Integer> Liste = new ArrayList<Integer>();
		Liste.add(5);
		Liste.add(3);
		Liste.add(2);
		Liste.add(7);
		Liste.add(9);
		Liste.add(2);
		
		System.out.println(Liste);
//		[5, 3, 2, 7, 9, 2]
		
		Iterator ite1=Liste.iterator();
		
		for (int i = 0; i < Liste.size(); i++) {
			
			System.out.println(ite1.hasNext() + "===="+ ite1.next());
			
		}
		
		System.out.println(ite1.hasNext());//false, hasNext sadece true-false döner
		System.out.println(ite1.next()); // hata verir
			
		
	

}



	}


