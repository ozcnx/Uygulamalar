package Day_1205;

import java.util.Scanner;

public class C11 {

	public static void main(String[] args) {
		/*  Kullanýcýdan 1'den büyük bir tam sayý girmesini isteyin
        ve 1'den girilen tam sayýya kadar olan sayýlarýn karelerinin toplamýný
        hesaplayan kodu yazýnýz.

        Örnek Ekran Çýktýsý
       Girilen sayý=4
       Kareler toplamý=30
    */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		for (int i = 1; i <=sayi; i++) {
			toplam+=(i*i);
			
			
			
		}
		System.out.println(toplam);
	}

}
