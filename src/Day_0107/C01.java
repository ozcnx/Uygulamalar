package Day_0107;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01 {

	public static void main(String[] args) {
		 //1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");

        //System.out.println(colors);
        
        for (String string : colors) {
        	System.out.println(string);
			
		}
        
        //3. Write a Java program to insert an element into the array list at the first position.
        colors.add(0, "Black");
        colors.add(1, "Pink");
        
        System.out.println(colors);
       
        
        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
	
        System.out.println(colors.get(0));
        System.out.println(colors.get(3));
        String first_element= colors.get(0);
        System.out.println(first_element);
        
      //5. Write a Java program to update specific array element by given element.
        
        colors.set(0, "Purple");
        System.out.println(colors);//[Purple, Pink, red, green, blue, yellow]
	
	
	//6. Write a Java program to remove the third element from a array list.
        
        colors.remove(2);
        System.out.println(colors);//[Purple, Pink, green, blue, yellow]
        
      //7. Write a Java program to search an element in a array list
        
        if (colors.contains("green")) {
        	System.out.println("Found the element");
			
		} else {
			System.out.println("There is no such element");
		}
        
       //8. Write a Java program to sort a given array list.
        
        Collections.sort(colors);
        System.out.println(colors);
        
       //9. Write a Java program to copy one array list into another. 
        
        ArrayList<String> newColors = new ArrayList<String>();
        newColors.add("car");
        newColors.add("car");
        newColors.add("car");
        newColors.add("car");
        newColors.add("car");
        newColors.add("car");// eleman sayisinin ayni olmasi veya fazla olmasi gerekiyor.
        
       Collections.copy(newColors, colors);
       System.out.println(newColors);
       
       //10. Write a Java program to shuffle elements in a array list.
       
       Collections.shuffle(colors);
       System.out.println(colors);
       
       //11. Write a Java program to reverse elements in a array list.
       Collections.reverse(colors);
       System.out.println(colors);
       
       //12. Write a Java program to extract a portion of a array list. 
       
       List<String> subColors = new ArrayList<String>();
       subColors=colors.subList(0, 3);//1 den basliyor, yani ilk 3 eleman icin 3 yaziyoruz
       System.out.println("Colors'in ilk 3 elemani:"+subColors);
       
       //13. Write a Java program to compare two array lists. 
      
       if (colors.equals(subColors)) {
    	   System.out.println("Listler esit");
		
	} else {
		System.out.println("Listler esit degil");
	}
       
//       List<String> list3=new ArrayList<String>();
//       for (String w : colors) {
//    	   list3.add(subColors.contains(w)? "Yes" : "No");
//    	   System.out.println(list3);
//		
//	}
       
       //14. Write a Java program of swap two elements in an array list
       
       Collections.swap(colors, 0, 2);
       System.out.println(colors);//[blue, green, Pink, Purple, yellow]
       
       //15. Write a Java program to join two array lists.
       
       List<String> list2=new ArrayList<String>();
       list2.addAll(colors);
       list2.addAll(newColors);
       System.out.println(list2);
       
       //16. Write a Java program to clone an array list to another array list.
       
       ArrayList<String> list1=new ArrayList<String>();
       
       list1=(ArrayList<String>) colors.clone();
       System.out.println(list1);
       
       //17. Write a Java program to empty an array list.
       
       list1.removeAll(list1);
       System.out.println(list1);
       
       //18. Write a Java program to test an array list is empty or not
       
       System.out.println(colors.isEmpty());//false
       
       if (list1.isEmpty()) {
		System.out.println("List1 Bos");
	} else {
		System.out.println("List1 Bos degil");

	}
       //19. Write a Java program to trim the capacity of an array list the current list size.
       
       colors.trimToSize();
       System.out.println(colors);
       
       //20. Write a Java program to increase the size of an array list.???
       ArrayList<String> ls=new ArrayList<String>(3);
       
      
      ls.add("Mor");
      ls.add("Pembe");
      ls.add("Sari");
      ls.add("Mavi");
      ls.add("Yesil");
      
      System.out.println(ls);
      
      //21. Write a Java program to replace the second element of a ArrayList with the specified element.
      
       
      ls.
       
       
       
       
       
        
        
        
	
	
	
	
	
	
	
	}
	
	 
		
	
}
