package Day_1205;

import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		 /*
        Bir sayinin m�kemmel olup olmadi�ini bulan bir program yaziniz.
        M�kemmel sayi : bir sayinin kendisi hari� b�lenlerinin toplam�, kendisine e�itse o sayi m�kemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (M�kemmel)

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
	            System.out.println(sayi + " M�kemmel bir sayidir");
	        }
	        else {
	            System.out.println(sayi + " M�kemmel bir sayi degildir.");
	        }
	    }
	}


