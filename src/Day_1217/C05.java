package Day_1217;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05 {

	public static void main(String[] args) {
		
		
	List<String> liste = new ArrayList<>();
	liste.add("Ali");
	liste.add("Veli");
	liste.add("Ayse");
	liste.add("Fatma");
	liste.add("Emrah");
	
	System.out.println(liste);
	
	ListIterator list1=liste.listIterator();
	
	while (list1.hasNext()) {
		
		
		list1.set(list1.next()+"X");
		
	}
		
	System.out.println(liste);//[AliX, VeliX, AyseX, FatmaX, EmrahX]
	}

}
