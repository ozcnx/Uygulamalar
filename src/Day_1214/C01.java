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
		 * Basarili Market al��-veri� program�. 1. Ad�m: �r�nler ve fiyatlar� i�eren
		 * listeleri olu�turunuz. No �r�nFiyat =========== ========= 00 Domates 2.10 TL
		 * 01 Patates 3.20 TL 02 Biber 1.50 TL 03 So�an 2.30 TL 04 Havu� 3.10 TL 05 Elma
		 * 1.20 TL 06 Muz 1.90 TL 07 �ilek 6.10 TL 08 Kavun 4.30 TL 09 �z�m 2.70 TL 10
		 * Limon 0.50 TL 2. Ad�m: Kullan�c�n�n �r�n nosuna g�re listeden �r�n se�mesini
		 * isteyiniz. 3. Ad�m: Ka� kg sat�n almak istedi�ini sorunuz. 4. Ad�m: Al�nacak
		 * bu �r�n� sepete ekleyiniz ve Sepeti yazd�r�n�z. 5. Ba�ka bir �r�n al�p almak
		 * istemedi�ini sorunuz. 6. E�er devam etmek istiyorsa yeniden �r�n se�me
		 * k�sm�na y�nlendiriniz. 7. E�er bitirmek istiyorsa �demeyi kontrol edip para
		 * ustu hesaplayarak program� bitirinzi.
		 */

		ArrayList<String> sUrunler = new ArrayList<String>();
		ArrayList<Double> sfiyatlar = new ArrayList<Double>();
		ArrayList<Double> sKilo = new ArrayList<Double>();

		ArrayList<String> urunler = new ArrayList<String>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc",
				"Elma", "Muz", "Cilek", "Kavun", "�z�m", "Limon"));
		ArrayList<Double> fiyatlar = new ArrayList<Double>(
				Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));

		System.out.println(">>>>>>>>>>Basarili Markete Hosgeldiniz<<<<<<<<<<");

		do {

			System.out.println("\n" + "L�tfen satin almak istediginiz �r�n�n numarasini giriniz");

			System.out.println("\n" + "Urun No\tUrun Adi\tFiyati");
			System.out.println("================================");

			for (int i = 0; i < urunler.size(); i++) {
				System.out.println(i + "\t" + urunler.get(i) + "\t" + "\t" + fiyatlar.get(i) + "-Euro");

			}

			Scanner scan = new Scanner(System.in);
			secim = scan.nextInt();

			if (secim < 0 || secim > 10) {

				System.out.println("Sectiginiz �r�n mevcut degildir");

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

				System.out.println("\nBaska �r�n satin almak istiyor musunuz? \nEvet>>>E, Hayir>>>H");

				devam = scan.next().toUpperCase().charAt(0);

			}

		} while (devam != 'H');

		for (int i = 0; i < sUrunler.size(); i++) {

			System.out.println(
					i + 1 + "\t" + urunler.get(i) + "\t" + sKilo.get(i) + "-kg" + "\t" + sfiyatlar.get(i) + "-Euro");
		}

		do {

			System.out.println("\n" + "Odemeniz gereken Tutar =" + toplamTutar);

			System.out.println("\n" + "L�tfen �deme miktarini giriniz");
			Scanner scan = new Scanner(System.in);
			odeme = scan.nextDouble();

			if (odeme >= toplamTutar) {

				System.out.println("Para �st� = " + (odeme - toplamTutar) + "-Euro");
				System.out.println("Tesekk�r eder, Iyi G�nler Dileriz");
				break;

			} else {

				System.out.println("Eksik �deme yaptiniz. L�tfen " + (toplamTutar - odeme) + "-Euro daha �deyiniz");
				toplamTutar -= odeme;

			}
		} while (odeme != toplamTutar);

		System.out.println(">>>>>>>>>Basarili Market<<<<<<<<<<");

	}

}
