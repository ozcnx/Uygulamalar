package Day_1210;

import java.util.Scanner;

public class Bankamatik {

	static String sifre = "12345";
	static String kartNo = "13579";
	static double bakiye = 1000;

	public static void main(String[] args) {
		/*
		 * ATM Kullaniciya giri� i�in kart numarasi ve �ifresini isteyin, eger herhangi
		 * birini yanlis girerse tekrar isteyin. Kart numarasi aralarda bo�luk ile
		 * girerse de eger do�ruysa kabul edin. Kart numarasi ve sifre dogrulanirsa
		 * kullanicinin yapabilece�i i�lemleri ekrana yazdirin,
		 * 
		 * Bakiye sorgula, para yatirma, para �ekme, para g�nderme, sifre de�i�tirme ve
		 * cikis.
		 * 
		 * Para �ekme ve para gonderme i�leminde mevcut bakiyeden buyuk para �ekilemez,
		 * Para g�nderme i�leminde istenen iban TR ile baslamali ve toplam 26 karakterli
		 * olmali, eger de�ilse men� ekranina geri donsun. Sifre de�i�tirme i�leminde
		 * mevcut �ifreyi teyit ettikten sonra, sifre de�i�iklik i�lemini yapmali,
		 */

		String kartNum = "";
		String sifrem = "";

		do {

			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen Kart Numaranizi giriniz");
			kartNum = scan.nextLine().replaceAll("\\s", "");
			System.out.println("Lutfen Sifrenizi giriniz");
			sifrem = scan.nextLine();

			if (kartNum.equals(kartNo) && sifre.equals(sifrem)) {

				System.out.println("Giris Basarili");
				System.out.println("*************************************");

			} else {
				System.out.println("Hatali giris, lutfen tekrar deneyiniz");

			}

		} while (!sifrem.equals(sifre) || !kartNum.equals(kartNo));
		
		
	

		
	
		int secim=0;
	
		

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println(
					"Lutfen yapmak istediginiz islemi seciniz\n1-->Bakiye sorgulama\n2-->Para cekme\n3-->Para yatirma\n4-->Para gonder\n5-->Sifre degistir\n6-->Cikis");
			
			secim = scan.nextInt();
			switch (secim) {

			case 1:
				bakiye();
				break;

			case 2:
				paraCekme();
				break;

			case 3:
				paraYatirma();
				break;

			case 4:
				paraGonder();
				break;

			case 5:
				sifreDegistir();
				break;

			case 6:
				cikis();
				break;

			default:
				System.out.println("Lutfen gecerli bir secim yapiniz");

				break;

			}

		} while (secim != 6);

		
	}

	private static void cikis() {
		System.out.println("Cikis islemi basarili");
		System.out.println("*************************************");
	}

	private static void sifreDegistir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen mevcut sifrenizi giriniz");
		String sifre2 = scan.next();

		if (!sifre2.equals(sifre)) {
			System.out.println("Hatali sifre girdiniz");
			System.out.println("*************************************");
			

		} else {
			
			System.out.println("Yeni sifrenizi giriniz");
			String yeniSifre=scan.next();
			System.out.println("Yeni sifrenizi basariyla olusturuldu");
			System.out.println("*************************************");
		}

	}

	private static void paraGonder() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen gonderilecek IBAN numarasini girin");
		String iban=scan.nextLine().toUpperCase().replaceAll("\\s", "");
		
		if (iban.startsWith("TR") && iban.length()==26) {
			
			System.out.println("Lutfen gondermek istediginiz tutari giriniz");
			
			double tutar3=scan.nextDouble();
		
			if (tutar3<=bakiye) {
				
				System.out.println(tutar3 + "Euro" + " " + "hesabinizdan gonderilmistir");
				bakiye -= tutar3;	
				System.out.println("Bakiyeniz =" + bakiye +" "+ "Euro");
				System.out.println("*************************************");
			}else {
					System.out.println("Yetersiz Bakiye");
					System.out.println("*************************************");
			
		}
			
		
		}
		
		else {
			System.out.println("Hatali giris yaptiniz");
			System.out.println("*************************************");
		}
		
		
	}

	private static void paraYatirma() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen yatirmak istediginiz tutari giriniz");
		double tutar1 = scan.nextDouble();


			System.out.println(tutar1 + "Euro" + " " + "hesabiniza yatirilmistir");
			bakiye += tutar1;
			
			System.out.println("Bakiyeniz =" + bakiye +" "+ "Euro");
			System.out.println("*************************************");
		}
	

	private static void paraCekme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cekmek istediginiz tutari giriniz");
		double tutar2 = scan.nextDouble();

		if (tutar2 > bakiye) {
			System.out.println("Yetersiz Bakiye");

		} else {
			System.out.println(tutar2 + "Euro" + " " + "hesabinizdan odenmistir");
			bakiye -= tutar2;

			System.out.println("Bakiyeniz =" + bakiye + "Euro");
			System.out.println("*************************************");

		}

	}

	private static void bakiye() {

		System.out.println("Bakiyeniz =" + bakiye + "Euro");
		System.out.println("*************************************");

	}

}
