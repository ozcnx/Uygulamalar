package Day_1205;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		 /*
        Girilen bir stringdeki a harfi say�s�n� bulunuz.
        ama  c harfine  gelirse d�ng�den ��k�ls�n

        Bug�n hava oldukca g�zel.-> 2
         str.CharAt(0)
*/
        
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir c�mle giriniz");
		String str=scan.nextLine();
		int toplam=0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.toLowerCase().charAt(i)=='a') {
				toplam++;
				
				
			} else if (str.toLowerCase().charAt(i)=='c') {
				break;
				
			} 
			
			
		}
			System.out.println("Girilen c�mledeki a sayisi"+" "+toplam);
	}

}

		
		