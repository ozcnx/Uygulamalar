package Day_1205;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		/*  Problem Tan�m�
	       2 boyutlu bir tablo olarak, ekrana �arp�m tablosunu hesaplay�p yazan kodu yaz�n�z.

	       �rnek Ekran ��kt�s�
	       1  2  3  4  5
	       2  4  6  8 10
	       3  6  9 12 15
	       4  8 12 16 20
	       5 10 15 20 25

	       Ekran ��kt�s� 5 x 5 boyutlar� i�in �rnek olarak verilmi�tir,
	       isterseniz boyutlar� klavyeden okuyup istenen boyutlara g�re
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
