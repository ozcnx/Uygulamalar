package Day_1206;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem   */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String kelime=scan.next();
		
		ters(kelime);
		System.out.println(ters(kelime));

	}

	private static String ters(String kelime) {
		String kalanHarfler="";

		if (kelime.startsWith("gh")) {
			kalanHarfler=kelime;
			
			System.out.println(kelime);
			
		} else if (kelime.startsWith("g")) {
			kalanHarfler=kelime.charAt(0)+kelime.substring(2);			
			
		} else if (kelime.charAt(1)=='h') {
			kalanHarfler=kelime.substring(1);
			
		} else {

		kalanHarfler=kelime.substring(2);

		
			

		}
		return kalanHarfler;
		
	}

}
