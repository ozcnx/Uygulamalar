package Day_1205;

import java.util.Scanner;

public class C11 {

	public static void main(String[] args) {
		/*  Kullan�c�dan 1'den b�y�k bir tam say� girmesini isteyin
        ve 1'den girilen tam say�ya kadar olan say�lar�n karelerinin toplam�n�
        hesaplayan kodu yaz�n�z.

        �rnek Ekran ��kt�s�
       Girilen say�=4
       Kareler toplam�=30
    */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int toplam=0;
		
		for (int i = 1; i <=sayi; i++) {
			toplam+=(i*i);
			
			
			
		}
		System.out.println(toplam);
	}

}
