package Day_1214;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class C01 {

	static char devam = '0';
	static int secim = 0;
	static double toplamTutar = 0;
	static double odeme = 0;

	public static void main(String[] args) {

		/*
		 * Basarili Market alýþ-veriþ programý. 1. Adým: Ürünler ve fiyatlarý içeren
		 * listeleri oluþturunuz. No ÜrünFiyat =========== ========= 00 Domates 2.10 TL
		 * 01 Patates 3.20 TL 02 Biber 1.50 TL 03 Soðan 2.30 TL 04 Havuç 3.10 TL 05 Elma
		 * 1.20 TL 06 Muz 1.90 TL 07 Çilek 6.10 TL 08 Kavun 4.30 TL 09 Üzüm 2.70 TL 10
		 * Limon 0.50 TL 2. Adým: Kullanýcýnýn ürün nosuna göre listeden ürün seçmesini
		 * isteyiniz. 3. Adým: Kaç kg satýn almak istediðini sorunuz. 4. Adým: Alýnacak
		 * bu ürünü sepete ekleyiniz ve Sepeti yazdýrýnýz. 5. Baþka bir ürün alýp almak
		 * istemediðini sorunuz. 6. Eðer devam etmek istiyorsa yeniden ürün seçme
		 * kýsmýna yönlendiriniz. 7. Eðer bitirmek istiyorsa ödemeyi kontrol edip para
		 * ustu hesaplayarak programý bitirinzi.
		 */

		ArrayList<String> sUrunler = new ArrayList<String>();
		ArrayList<Double> sfiyatlar = new ArrayList<Double>();
		ArrayList<Double> sKilo = new ArrayList<Double>();

		ArrayList<String> urunler = new ArrayList<String>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc",
				"Elma", "Muz", "Cilek", "Kavun", "Üzüm", "Limon"));
		ArrayList<Double> fiyatlar = new ArrayList<Double>(
				Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));

		System.out.println(">>>>>>>>>>Basarili Markete Hosgeldiniz<<<<<<<<<<");

		do {

			System.out.println("\n" + "Lütfen satin almak istediginiz ürünün numarasini giriniz");

			System.out.println("\n" + "Urun No\tUrun Adi\tFiyati");
			System.out.println("================================");

			for (int i = 0; i < urunler.size(); i++) {
				System.out.println(i + "\t" + urunler.get(i) + "\t" + "\t" + fiyatlar.get(i) + "-Euro");

			}

			Scanner scan = new Scanner(System.in);
			secim = scan.nextInt();

			if (secim < 0 || secim > 10) {

				System.out.println("Sectiginiz ürün mevcut degildir");

			} else {

				System.out.println("Kac kilo " + " " + urunler.get(secim) + " " + "satin almak istiyorsunuz?");

				double kilo = scan.nextDouble();

				double fiyat = kilo * fiyatlar.get(secim);

				System.out.println(
						"Seciminiz : " + " " + urunler.get(secim) + "\t" + kilo + "-kg" + "\t" + fiyat + "-Euro");

				toplamTutar += fiyat;

				sUrunler.add(urunler.get(secim));
				sfiyatlar.add(fiyat);
				sKilo.add(kilo);

				System.out.println("\nBaska ürün satin almak istiyor musunuz? \nEvet>>>E, Hayir>>>H");

				devam = scan.next().toUpperCase().charAt(0);

			}

		} while (devam != 'H');

		for (int i = 0; i < sUrunler.size(); i++) {

			System.out.println(
					i + 1 + "\t" + urunler.get(i) + "\t" + sKilo.get(i) + "-kg" + "\t" + sfiyatlar.get(i) + "-Euro");
		}

		do {

			System.out.println("\n" + "Odemeniz gereken Tutar =" + toplamTutar);

			System.out.println("\n" + "Lütfen ödeme miktarini giriniz");
			Scanner scan = new Scanner(System.in);
			odeme = scan.nextDouble();

			if (odeme >= toplamTutar) {

				System.out.println("Para Üstü = " + (odeme - toplamTutar) + "-Euro");
				System.out.println("Tesekkür eder, Iyi Günler Dileriz");
				break;

			} else {

				System.out.println("Eksik ödeme yaptiniz. Lütfen " + (toplamTutar - odeme) + "-Euro daha ödeyiniz");
				toplamTutar -= odeme;

			}
		} while (odeme != toplamTutar);

		System.out.println(">>>>>>>>>Basarili Market<<<<<<<<<<");

	}

}
