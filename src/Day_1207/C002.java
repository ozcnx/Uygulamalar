package Day_1207;

import java.util.Scanner;

public class C002 {

	public static void main(String[] args) {
		// 3 # Kullan�c�n�n sisteme girdi�i 3 say�n�n hangisinin en b�y�k say� oldu�unu ekrana basan program� yaz�n�z.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("�c sayi girin. \nHer giristen sonra entere basin");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En b�y�k sayi : "+ sayi1);
			
		} else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En b�y�k sayi : "+ sayi2);
			
		} else if (sayi3>sayi2 && sayi3>sayi1) {
			System.out.println("En b�y�k sayi : "+ sayi3);
			
		} else {

			System.out.println("Sayilar esittir");

		

		}

	}

}
