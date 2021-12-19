package Day_1206;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		 /*
        Problem tanýmý :
        Bir String içinde kaç kelime olduðunu yazdýran bir method yazýnýz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
		
		Scanner scan= new Scanner (System.in);
        System.out.println("bir string giriniz :");
        String str= scan.nextLine();
        
        kelimeSay(str);
        
        System.out.println("cmledeki elime sayisi : "+kelimeSay(str));
        
        

	}

	private static int kelimeSay(String str) {

	int sayac=0;
	
	for (int i = 0; i <str.length(); i++) {
		if (str.charAt(i)==' ') {
			sayac++;
			
			
		}
		
	}
	return sayac+1;
	 
		
	
	

	}

}
