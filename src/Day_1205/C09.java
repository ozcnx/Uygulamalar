package Day_1205;

import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
		 	System.out.print("harf giriniz: ");
	        String harf=scan.next().toLowerCase();
	        
	        String sesliHarf = "aeuoi";
	        String sessizHarf = "bcdfghjklmnprstvyzxwq";
	        
	        
			if (sesliHarf.contains(harf)) {
				System.out.println("sesli harf");
				
			} else if (sessizHarf.contains(harf)) {
				System.out.println("sessiz Harftir");
				
			} else {

		System.out.println("Lutfen sadece harf giriniz");

			}

	}

}
