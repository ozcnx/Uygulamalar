package Day_1204;

import java.util.Scanner;

public class AL_08 {

	public static void main(String[] args) {
		//Kullanicidan 5 basamakli bir sayi alin ve sayinin rakamlar toplamini hesaplayan bir kod yazin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 5 basamakli bir sayi giriniz");
		
		int sayi=scan.nextInt();
		
		int RakamlarToplami=0;
		
		int rakam= sayi%10;
		
		RakamlarToplami+=rakam;
		
		sayi/=10;
		
		 //5
		
		
		
		rakam=sayi%10;
		
		RakamlarToplami+=rakam;
		
		sayi/=10;
		
		 //9
		
		
		rakam=sayi%10;
		
		RakamlarToplami+=rakam;
		
		sayi/=10;
		
		
		rakam=sayi%10;
		
		RakamlarToplami+=rakam;
		
		sayi/=10;
		
		//12
		
		
		rakam=sayi%10;
		
		RakamlarToplami+=rakam;
		
		sayi/=10;
		
		//14
		
		
		rakam=sayi%10;
		
		RakamlarToplami+=rakam;
		
		sayi/=10;
		
		System.out.println("Sayinin rakamlar toplami : " + RakamlarToplami); //15
		

		
		
		
	}

}
