package Day_1203;

import java.util.Scanner;

public class �2 {

	public static void main(String[] args) {
		
		//Kullanicidan iki sayi alin ve b�y�k olmayan sayiyi yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir birinci sayi giriniz");
		
		double sayi1=scan.nextDouble();
		
		System.out.println("Lutfen ikinci sayiyi giriniz");
		
		double sayi2=scan.nextDouble();
		
		
		System.out.println(sayi1>sayi2 ? sayi2 : sayi1);
		
		
		
		
		
		
		
		
		

	}

}
