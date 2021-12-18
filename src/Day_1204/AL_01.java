package Day_1204;

import java.util.Scanner;

public class AL_01 {

	public static void main(String[] args) {
		// Kullanicidan yaricap isteyip, cemberin cevresini ve dairenin alanini hesaplayan kod yaz.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen yaricap giriniz");
		
		double yaricap=scan.nextDouble();
		double cevre=2*3.14*yaricap;
		double alan=3.14*yaricap*yaricap;
		
		System.out.println("Cemberin cevresi : " + cevre);
		System.out.println("Cemberin alani : " + alan);
		
		/* Lütfen yaricap giriniz
		5
		Cemberin cevresi : 31.400000000000002
		Cemberin alani : 78.5 */
		
		scan.close();	

	}

}
