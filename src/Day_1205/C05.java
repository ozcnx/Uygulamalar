package Day_1205;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		// Kullanicidan dikd�rtgenin genisligini ve uzunligunu buna g�re yildislarla
		//bir dik d�rtgen olusturun
		/*
		 ******
		 ******
		 ******
		 ****** gibi
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dikd�rgenin enini girin");
		int en=scan.nextInt();
		
		System.out.println("Dikd�rgenin boyunu girin");
		int boy=scan.nextInt();
		
		for (int i = 1; i <= boy; i++) {
			for (int j = 1; j <=en; j++) {
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		
	}

}
