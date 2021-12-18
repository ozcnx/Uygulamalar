package Day_1205;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		 /*
        Girilen bir stringdeki a harfi sayýsýný bulunuz.
        ama  c harfine  gelirse döngüden çýkýlsýn

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
*/
        
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cümle giriniz");
		String str=scan.nextLine();
		int toplam=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i)=='a') {
				toplam++;
				
				
			} else if (str.toLowerCase().charAt(i)=='c') {
				break;
				
			} 
			
			
		}
			System.out.println("Girilen cümledeki a sayisi"+" "+toplam);
	}

}

		
		