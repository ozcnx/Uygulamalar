package Day_0105;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Player 1");
		Scanner scan = new Scanner(System.in);
		System.out.println("Oyunu baslatmak icin bir kelime girin");
		String kelime = scan.next();
		
		System.out.println("Kelime gecerli mi?\nEvet-->>>E, Hayir-->>>H");
		System.out.println("\n"+"Player 2");
		char gecerli = scan.next().toUpperCase().charAt(0);
		
		if (gecerli=='H') {
			System.out.println("Geçersiz kelime, MevcutPlayer1 oyunu kazandý");
				
		} else {
			System.out.println("Oyuna devam etmek istiyor musunuz?");
			char devam = scan.next().toUpperCase().charAt(0);

			if (devam == 'H') {

				System.out.println("Game Finished");
				// Puanlari ve kazanani yazdiran metod
				System.out.println();
				break;
			} else if (devam == 'E') {
			System.out.println("Player1 "+kelime.length()+"puan kazandi");
			System.out.println("Kelimeye eklemek icin bir harf girin");
			char harf = scan.next().charAt(0);
			System.out.println(
					"Harfi kelimenin basina ya da sonuna ekleyin.\nKelime Basi icin B'ye, Kelime Sonu icin S'ye basin");
			char ekle = scan.next().toUpperCase().charAt(0);
			

		}
		
		
		
		
		
	}

}
