package Day_1207;

import java.util.Scanner;

public class C003 {

	public static void main(String[] args) {
		// ÖRNEK 4 # Kullanýcýnýn sisteme girdiði herhangi bir sayýnýn 
		//faktoriyel deðerini hesaplayýp ekrana basan programý yazýnýz.
		//Bir sayýnýn faktöriyeli o sayýndan önce yer alan bütün tamsayýlarýn
		//1 sayýsýna gelinceye kadar sýralanýp çarpýlmasýyla bulunan sayýdýr. 
		//Söz gelimi 4! (Dört faktöriyel) 1x2x3x4=24'tür

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi=scan.nextInt();
		int fakt=1;
		
		for (int i = 1; i <= sayi; i++) {
			
			fakt=fakt*i;
			
			
			
		}
		System.out.println(fakt);
	}

}
