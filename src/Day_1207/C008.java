package Day_1207;

import java.util.Arrays;
import java.util.Scanner;

public class C008 {

	public static void main(String[] args) {
		// Kullan�c�n�n istedi�i kadar say�y�, kullan�c�dan alarak bir diziye (arraya) aktaran, 
		//bu say�lar�n toplam�n� ve ortalamas�n� bulan program�n� yaz�n�z?
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Dizi boyutunu giriniz : ");
		int boyut=scan.nextInt();
		
		int toplam=0;
		double ortalama=0;
		
		int [] dizi=new int [boyut];
		
		for (int i = 0; i < boyut; i++) {
			System.out.println((i+1)+" "+".Eleman : ");
			
			dizi[i]=scan.nextInt();
			toplam+=dizi[i];
				
		}
		
		
		ortalama=toplam/boyut;
		System.out.println("Sayilarin Toplami : "+toplam);
		System.out.println("Sayilarin Ortalamasi : " +ortalama);
		

	}

}
