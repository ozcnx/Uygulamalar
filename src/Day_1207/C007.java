package Day_1207;

import java.util.Scanner;

public class C007 {

	public static void main(String[] args) {
		//Kullanicidan alinan 4 basamakli bir sayiyi yazi ile yaziniz
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir d�rt basamakli sayi girin");
		int sayi=scan.nextInt();
		
		int binler=0;
		int y�zler=0;
		int onlar=0;
		int birler=0;
		
		char ch= '0';
		
		ch=Integer.toString(sayi).charAt(0);
		binler=Integer.parseInt(Character.toString(ch));
		
		ch=Integer.toString(sayi).charAt(1);
		y�zler=Integer.parseInt(Character.toString(ch));
		
		ch=Integer.toString(sayi).charAt(2);
		onlar=Integer.parseInt(Character.toString(ch));
		
		ch=Integer.toString(sayi).charAt(3);
		birler=Integer.parseInt(Character.toString(ch));
		
		
		String [] bin = {" ","Bin", "Ikibin", "�cbin", "D�rtbin", "Besbin", "Altibin","Yedibin","Sekizbin","Dokuzbin"};
		String [] y�z = {" ","Y�z", "Ikiy�z", "�cy�z", "D�rty�z", "Besy�z", "Altiy�z","Yediy�z","Sekizy�z","Dokuzy�z"};
		String [] on = {" ","On", "Yirmi", "Otuz", "Kirk", "Elli", "Altmis","Yetmis","Seksen","Doksan"};
		String [] bir = {" ","Bir", "Iki", "�c", "D�rt", "Bes", "Alti","Yedi","Sekiz","Dokuz"};
		
		System.out.println(sayi +"'sayisinin okunusu : " +bin[binler]+y�z[y�zler]+on[onlar]+bir[birler]);
		
		
		

	}

}
