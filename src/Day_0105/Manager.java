package Day_0105;

import java.util.Scanner;

public class Manager {
	static String kelime = "bir";
	static String yeniKelime = " ";
	static int oyuncu1Puan = 0;
	static int oyuncu2Puan = 0;
	static char devam1 = '1';
	static int puan1=yeniKelime.length();
	
	static char gecerliMi='e';

	public static void main(String[] args) {
		baslat();
	}
	static void baslat() {
		
			System.out.println("Player 1");
			Scanner scan = new Scanner(System.in);
			System.out.println("Oyunu baslatmak icin bir kelime girin");
			kelime = scan.next();
			
			System.out.println("Player 2");
			yeniKelime = kelime;
			System.out.println("Kelime gecerli mi?");
			char gecerliMi;
			gecerliMi = scan.next().toUpperCase().charAt(0);

			if (gecerliMi == 'E') {
				harfEkle();
			} else {
				System.out.println("Geçersiz kelime, Mevcut oyuncu oyunu kazandý");
				
			}
			
		}//*****
			
			static void harfEkle(){
				
					
				
			Scanner scan = new Scanner(System.in);
			System.out.println("Kelimeye eklemek icin bir harf girin");
			char harf = scan.next().charAt(0);
			
			System.out.println(
					"Harfi kelimenin basina ya da sonuna ekleyin.\nKelime Basi icin B'ye, Kelime Sonu icin S'ye basin");
			char ekle = scan.next().toUpperCase().charAt(0);

			if (ekle == 'B') {

				System.out.println("Yeni Kelime  :" + harf + yeniKelime);
				yeniKelime = harf + yeniKelime;

			} else if (ekle == 'S') {
				System.out.println("Yeni Kelime  :" + yeniKelime + harf);
				yeniKelime = yeniKelime + harf;

			} 
			
			System.out.println("Player 2");
			
			System.out.println("Kelime gecerli mi?");
			
			gecerliMi = scan.next().toUpperCase().charAt(0);

			if (gecerliMi == 'E') {
				puan1+=yeniKelime.length();
			} else {
				System.out.println("Geçersiz kelime, Mevcut oyuncu oyunu kazandý");
			
			}
			System.out.println("Oyuna devam etmek istiyor musunuz?");
			devam1 = scan.next().toUpperCase().charAt(0);

			if (devam1 == 'E') {
				harfEkle();
				
				
				System.out.println();
				
			}else {
				System.out.println("Game Finished");
				System.out.println(puan1);
			}
			
				} 
}

