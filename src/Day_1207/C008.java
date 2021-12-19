package Day_1207;

import java.util.Arrays;
import java.util.Scanner;

public class C008 {

	public static void main(String[] args) {
		// Kullanýcýnýn istediði kadar sayýyý, kullanýcýdan alarak bir diziye (arraya) aktaran, 
		//bu sayýlarýn toplamýný ve ortalamasýný bulan programýný yazýnýz?
		
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
