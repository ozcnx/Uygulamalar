package Day_1204;

import java.util.Scanner;

public class AL_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen birinci sayiyi girin");
		
		int sayi1=scan.nextInt();
		
		System.out.println("Lutfen ikinci sayiyi girin");
		
		
		int sayi2=scan.nextInt();
		
		System.out.println("Girdiginiz sayilarin toplami : " + (sayi1+sayi2));
		System.out.println("Girdiginiz sayilarin farki : " + (sayi1-sayi2));
		System.out.println("Girdiginiz sayilarin carpimi : " + (sayi1*sayi2));
		
		
	}

}
