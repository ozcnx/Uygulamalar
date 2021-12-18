package Day_1202;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dönüstürmek istediginiz birimi secin");
		String birim=scan.nextLine().toLowerCase();
		System.out.println("Lutfen dönüstürmek istediginiz miktari yazin");
		double miktar=scan.nextDouble();
		
		donüstür(birim, miktar);
		
		
		
		
	}

	private static void donüstür(String birim, double miktar) {


		switch(birim) {
		
		case "mil" :
			System.out.println(miktar*1.6+" "+"km");
			break;
		case "saat" : 
			System.out.println(miktar*60*60+" "+"saniye");
			break;
		case "kg" :
			System.out.println(miktar*1000+" "+"gram");
			break;
			
		default:
			System.out.println("gecerli birim giriniz");
		
		}
		
	}

}
