package Day_1204;

import java.util.Scanner;

public class AL_07 {

	public static void main(String[] args) {
		/*  Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
		Isminiz : Mehmet
		Soyisminiz : Bulut
		Kursumuza katiliminiz alinmistir,tesekkur ederiz */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi giriniz");
		
		String ad=scan.next();
		
		System.out.println("Lutfen soyadinizi giriniz");
		
		String soyAd=scan.next();
		
		System.out.println("Isminiz : " + ad);
		System.out.println("Soy Isminiz : " + soyAd);
		System.out.println("Kursumuza katiliminiz alinmistir,tesekkur ederiz");
		
		
		

	}

}
