package Day_1207;

import java.util.Scanner;

public class C006 {

	public static void main(String[] args) {
		// Kullanicidan alinan bir cümlede kac adet kelime ve 
		// kac adet harf bulundugunu hesaplayan program yazin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bir cümle girin");
		
		String cumle=scan.nextLine();
		
		
		int sayac=0;
		
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i)==' ') sayac++;	
			
		}
			System.out.println("Kelime sayisi : "+ (sayac+1));
			
			System.out.println("Harf sayisi :"+ (cumle.length()-sayac));
	}

}
