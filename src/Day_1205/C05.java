package Day_1205;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		// Kullanicidan dikdörtgenin genisligini ve uzunligunu buna göre yildislarla
		//bir dik dörtgen olusturun
		/*
		 ******
		 ******
		 ******
		 ****** gibi
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dikdörgenin enini girin");
		int en=scan.nextInt();
		
		System.out.println("Dikdörgenin boyunu girin");
		int boy=scan.nextInt();
		
		for (int i = 1; i <= boy; i++) {
			for (int j = 1; j <=en; j++) {
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		
	}

}
