package Day_1207;

import java.util.Scanner;

public class C003 {

	public static void main(String[] args) {
		// �RNEK 4 # Kullan�c�n�n sisteme girdi�i herhangi bir say�n�n 
		//faktoriyel de�erini hesaplay�p ekrana basan program� yaz�n�z.
		//Bir say�n�n fakt�riyeli o say�ndan �nce yer alan b�t�n tamsay�lar�n
		//1 say�s�na gelinceye kadar s�ralan�p �arp�lmas�yla bulunan say�d�r. 
		//S�z gelimi 4! (D�rt fakt�riyel) 1x2x3x4=24't�r

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi girin");
		int sayi=scan.nextInt();
		int fakt=1;
		
		for (int i = 1; i <= sayi; i++) {
			
			fakt=fakt*i;
			
			
			
		}
		System.out.println(fakt);
	}

}
