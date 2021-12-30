package Day_1226;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C01 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 3, 15, 22, 28, 17, 67, 44, 39, 5));
		// printListStructured(list );//10 3 15 22 28 17 67 44 39 5
		// printListFunctional(list); //10 3 15 22 28 17 67 44 39 5
		// printCiftStructure(list); //10 22 28 44
		// printCiftKirkKucuk(list);
		//printTekYirmiBuyuk(list);
		//printCiftElFunctional2(list);
		//ciftKarePrint (list);//100 484 784 1936 
		//ciftKareKokPrint (list);
		//tekKupArtiBirPrint(list);
		//EnBuyukElPrint (list);
		 //CiftEnBuyukElKarePrint (list);
		 TumElToplaPrint (list); 
		 TumElToplaFunctionalPrint (list);
		
		
	}

	public static void print(int t) {
		System.out.print(t + " ");
	}

	public static boolean cift(int t) {
		return t % 2 == 0;
	}

	// 1)structured Programming ile list elemanlarinin tamamini aralarina bosluk
	// birakarak yazdiriniz
	public static void printListStructured(List<Integer> list) {

		for (Integer w : list) {
			System.out.print(w + " ");

		}

	}

	// 2)Functional Programming ile list elemanlerinin tamamini aralarina bosluk
	// birakarak yazdiriniz
	public static void printListFunctional(List<Integer> list) {

		list.stream().forEach(t -> System.out.print(t + " "));

	}

	// 3) structured Programming ile list elemanlarinin cift olanalrini ayni satirda
	// aralarina bosluk birakarak yazdiriniz
	public static void printCiftStructure(List<Integer> list) {

		for (Integer w : list) {
			if (w % 2 == 0) {
				System.out.print(w + " ");

			}
		}

	}

	// 4-Functional Programming ile list elemanlarinin cift olanalrini ayni satirda
	// aralarina bosluk birakarak yazdiriniz
	public static void printCiftFunctional(List<Integer> list) {

		list.stream().filter(t -> t % 2 == 0).forEach(C01::print);
	}

	public static void printCiftElFunctional2(List<Integer> list) {

		list.stream().filter(t -> t % 2 == 0).forEach(t->System.out.println(t+" "));
	}

	// Functional Programming ile list elemanlarinin cift olanalrinin 40 dan kucuk
	// olanlarýný ayni satirda aralarina bosluk birakarak yazdiriniz
	public static void printCiftKirkKucuk(List<Integer> list) {

		list.stream().filter(t -> t % 2 == 0 & t < 40).forEach(C01::print);
	}

	// Functional Programming ile list elemanlarinin tek olanalrini veya 20 dan
	// buyuk
	// olanlarýný ayni satirda aralarina bosluk birakarak yazdiriniz

	public static void printTekYirmiBuyuk(List<Integer> list) {

		list.stream().filter(t -> t % 2 == 1 & t > 20).forEach(C01::print);
	}
	// Functional Programming ile list elemanlarinin cift olanlarinin
	// karelerini ayni satirda aralarina bosluk birakarak yazdiriniz

	public static void ciftKarePrint (List<Integer> list) {
		
		list.stream().filter(C01::cift).map(t->(t*t)).forEach(t->System.out.print(t+" "));
		
	}

	//Functional Programming ile list elemanlarinin  tek olanlarinin
    // kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak yazdiriniz
	
	public static void tekKupArtiBirPrint (List<Integer> list) {
		
		list.stream().filter(t->t%2==1).map(t->(t*t*t)+1).forEach(C01::print);
	}
	
	//Functional Programming ile list elemanlarinin  cift olanlarinin
    // karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
	
	public static void ciftKareKokPrint (List<Integer> list) {
		
	list.stream().filter(C01::cift).map(Math::sqrt).forEach(t->System.out.print(t+" "));
	}
	
	  //list'in en buyuk elemanini yazdiriniz
	public static void EnBuyukElPrint (List<Integer> list) {
		
	Optional<Integer> list1=	list.stream().reduce(Math::max);
	System.out.println(list1);
	}
	// List'in cift olan elelmanlarin karelerini aliniz ve en buyugunu yazdiriniz
	public static void CiftEnBuyukElKarePrint (List<Integer> list) {
		Optional<Integer> list2= list.stream().filter(t->t%2==0).map(t->(t*t)).reduce(Math::max);
		System.out.println(list2);
	}
	// Listteki tüm elemanlarin toplamini yazdiriniz
	public static void TumElToplaPrint (List<Integer> list) {
		int toplam=0;
		for (Integer w : list) {
			toplam=toplam+w;
				
		}
		System.out.println(toplam);
	}
	public static void TumElToplaFunctionalPrint (List<Integer> list) {
		
		Optional<Integer> toplam=list.stream().reduce((t,u)->(t+u));
		System.out.println(toplam);
	}
	
	public static void TumElToplaFunctionalPrint2 (List<Integer> list) {
		
		Optional<Integer> toplam= list.stream().reduce(Integer::sum);
		System.out.println(toplam);
	}
	// Listteki cift elemanlarin carpimini yazdirin.
	public static void CiftElCarp (List<Integer> list) {
		
	Optional<Integer> list3=	list.stream().filter(t -> t % 2 ==0).reduce(Math::multiplyExact);
	}
	
}
