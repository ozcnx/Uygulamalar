package Day_1205;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler hari�, di�erlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak ��z�n�z.
		
		Scanner scan=new Scanner(System.in);
		int toplam=0;
		
		
		
		for (int i = 1; i <=5; i++) {
			System.out.println("Lutfen sayi giriniz");
			int sayi=scan.nextInt();
			
			
			
			if (sayi>5 && sayi<10) {
				System.out.println("Bu sayi toplanmayacak");
				continue;
				
			} 

			toplam+=sayi;
			
			
		}
			System.out.println("Girdiginiz sayilardan 5 ile 10 arasindaki sayilarin toplami : "+toplam);
	}

}
