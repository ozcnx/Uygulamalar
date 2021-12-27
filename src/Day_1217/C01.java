
	package Day_1217;

	import java.util.ArrayList;
	import java.util.List;

	public class C01 {

		public static void main(String[] args) {
			
			List<Integer> Liste = new ArrayList<Integer>();
			Liste.add(5);
			Liste.add(3);
			Liste.add(2);
			Liste.add(7);
			Liste.add(9);
			Liste.add(2);
			
			System.out.println(Liste);
			//index kulanmadan tüm elemanlari 3 eklenmis olarak yazdirin.
			
			for (Integer each : Liste) {
				System.out.print(each+3 + " ");
				
			}
			
			for (Integer each : Liste) {
				each+=3;
				
				System.out.print(each+3 + " ");
				
			}
		System.out.println();
		System.out.println(Liste);
		}

	}

