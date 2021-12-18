package Day_1205;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		/*  Problem Tanýmý
	       2 boyutlu bir tablo olarak, ekrana çarpým tablosunu hesaplayýp yazan kodu yazýnýz.

	       Örnek Ekran çýktýsý
	       1  2  3  4  5
	       2  4  6  8 10
	       3  6  9 12 15
	       4  8 12 16 20
	       5 10 15 20 25

	       Ekran çýktýsý 5 x 5 boyutlarý için örnek olarak verilmiþtir,
	       isterseniz boyutlarý klavyeden okuyup istenen boyutlara göre
	       ekrana basan bir kod yazabilirsiniz.*/
		
		int sayi=5;
		
		for (int i = 1; i <=sayi; i++) {
			for (int j = 1; j <=sayi; j++) {
				System.out.print(i*j+" ");
				
			}
			System.out.println();
		}
	

	}

}
