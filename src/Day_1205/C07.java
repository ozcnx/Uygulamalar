package Day_1205;

import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
	// Kullanicidan bir String isteyin. Kullanicinin girdigi
    // String�in palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen bir c�mle giriniz");
		String str=scan.nextLine();
		String tersStr="";
		
		for (int i = str.length()-1; i >=0; i--) {
			tersStr+=str.charAt(i);
			
		}
			// if for'un disinda acilacak
			if (str.equals(tersStr)) {
				System.out.println("C�mle palindromedir");
				
			} else {
				System.out.println("C�mle palindrome degildir");

			}
			

		

	}

}
