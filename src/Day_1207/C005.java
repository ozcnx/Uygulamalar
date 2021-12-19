package Day_1207;

import java.util.Scanner;

public class C005 {

	public static void main(String[] args) {
		// Palindrom Sayý Bulma
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Sayi Giriniz : ");
	        int sayi = scan.nextInt();
	        int ilkdeger = sayi;        
	        int length = String.valueOf(sayi).length();
	         
	        int kalan=0;
	        int deger=0;
	        for (int i = 0; i<length; i++){
	             
	            kalan = sayi % 10;
	            deger = deger * 10 + kalan;
	            sayi = sayi /10;
	        }
	         
	        if(deger == ilkdeger){
	            System.out.println(deger + " Palindrom Sayidir.");
	        }else{
	            System.out.println(deger + " Palindrom Sayi Degildir.");
	        }

	}

}
