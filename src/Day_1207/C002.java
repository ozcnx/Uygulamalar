package Day_1207;

import java.util.Scanner;

public class C002 {

	public static void main(String[] args) {
		// 3 # Kullanýcýnýn sisteme girdiði 3 sayýnýn hangisinin en büyük sayý olduðunu ekrana basan programý yazýnýz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Üc sayi girin. \nHer giristen sonra entere basin");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println("En büyük sayi : "+ sayi1);
			
		} else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println("En büyük sayi : "+ sayi2);
			
		} else if (sayi3>sayi2 && sayi3>sayi1) {
			System.out.println("En büyük sayi : "+ sayi3);
			
		} else {

			System.out.println("Sayilar esittir");

		

		}

	}

}
