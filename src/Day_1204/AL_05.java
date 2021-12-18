package Day_1204;

import java.util.Scanner;

public class AL_05 {

	public static void main(String[] args) {
		// Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini
		// hesaplayip yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen karenin kenar uzunlugunu yaziniz");
		
		int kenar=scan.nextInt();
		
		System.out.println("Karenin cevresi : " + kenar*4);
		System.out.println("Karenin alani : " + kenar*kenar);
		
		
		

	}

}
