package Day_1207;

import java.util.Scanner;

public class C001 {

	public static void main(String[] args) {
		 //2 # Kullan�c�n�n girdi�i say�dan itibaren ba�layan ve 50�e kadar olan say�lar� ekrana basan program� 
		//do while d�ng�s� ile yap�n�z.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir sayi girin");
		
		int sayi=scan.nextInt();
		
		do {
			System.out.print(sayi+" ");
			sayi++;
			
		} while (sayi<=50);
		

	}

}
