package Day_1204;

import java.util.Scanner;

public class AL_02 {

	public static void main(String[] args) {
		// // Soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen Isminizi giriniz");
		
		char ilkHarf=scan.next().charAt(0); //sifir kelimenin ilk harfini temsil eder.
		
		System.out.println("Isminizin ilk harfi : " + ilkHarf );
		
		/*Lütfen Isminizi giriniz
		Zülfikar
		Isminizin ilk harfi : Z  */
		
		scan.close();
		

	}

}
