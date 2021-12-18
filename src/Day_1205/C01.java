package Day_1205;

import java.util.Scanner;

public class C01 {
	public static void main(String[] args) {
		// Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
				// girdigi sayiya gore asagidaki sekli yazdirin
				// orn : 3 girilirse
				// 1
				// 1 2
				// 1 2 3
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		
			
		
		
		for (int satir = 1; satir <= sayi; satir++) {
			for (int sütun = 1; sütun <=satir; sütun++) {
				System.out.print(sütun+" ");
				
			}
			System.out.println();
		}
		
		
		
		
	}

}



