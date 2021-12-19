package Day_1207;

import java.util.Scanner;

public class C001 {

	public static void main(String[] args) {
		 //2 # Kullanýcýnýn girdiði sayýdan itibaren baþlayan ve 50’e kadar olan sayýlarý ekrana basan programý 
		//do while döngüsü ile yapýnýz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir sayi girin");
		
		int sayi=scan.nextInt();
		
		do {
			System.out.print(sayi+" ");
			sayi++;
			
		} while (sayi<=50);
		

	}

}
