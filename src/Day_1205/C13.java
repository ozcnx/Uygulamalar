package Day_1205;

public class C13 {

	public static void main(String[] args) {
		/*
		Problem Tanýmý
        Girilen bir sayý kadar satýr ve sütünu olan ve
        sað kenara dayalý üçgeni basan kodu yazýnýz.

        Ekran Çýktýsý
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */
		
		int sayi=5;
		

        for (int i = 1; i <= sayi; i++) {//satir kontrolu
            for (int j = sayi - i; j >= 0; j--) {//bosluk kontrolu
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {//yildiz kontrolu
                System.out.print("*");

            }
            System.out.println();
        }
       

	}

}
