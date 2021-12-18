package Day_1205;

import java.util.Scanner;

public class C12 {

	public static void main(String[] args) {
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String str=scan.nextLine();
		System.out.println("Lütfen bir harf giriniz");
		char harf=scan.next().toLowerCase().charAt(0);
		int toplam=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==harf) {
				toplam++;
				
			}
			
			
			
		}
		System.out.println(toplam);
		
	}

}
