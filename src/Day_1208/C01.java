package Day_1208;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// Kullan�c�dan bir isim ve bir karakter girmesini isteyin, 
		//ard�ndan d�ng�leri kullanarak karakterin isimde ka� kez tekrarland���n� 
		//kontrol edin.
		//char ch1= 'a' ;
		//String name =�John came late" 
		//Expected Output: 
		//Number of a = 2
		
		char ch1='a';
		String name="John came late";
		int sayac=0;
		
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i)==ch1) {
				sayac++;				
			}
			
		}
		
		System.out.println("Number of a = " + sayac);
	}

}
