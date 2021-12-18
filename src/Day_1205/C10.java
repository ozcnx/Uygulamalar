package Day_1205;

import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		 /*
        Bir sayinin mükemmel olup olmadiðini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamý, kendisine eþitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
		
	
	        
	        Scanner scan = new Scanner(System.in);
	        int toplam = 0;
	        
	        System.out.print("Bir sayi giriniz: ");
	        int sayi = scan.nextInt();
	        
	        for(int i = 1; i < sayi; i++)
	        {
	            if(sayi % i == 0) {
	                toplam += i;
	            }
	        }
	        if(sayi == toplam) {
	            System.out.println(sayi + " Mükemmel bir sayidir");
	        }
	        else {
	            System.out.println(sayi + " Mükemmel bir sayi degildir.");
	        }
	    }
	}


