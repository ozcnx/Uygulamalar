package Day_0113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class C02 {

	public static void main(String[] args) {

		// 11. Write a Java program to display the elements and their positions in a
		// linked list.

		LinkedList<String> l_list = new LinkedList<String>();

		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("orange");

		System.out.println("Original linked list:" + l_list);

		for (int i = 0; i < l_list.size(); i++) {

			System.out.println(i + ".Element =" + " " + l_list.get(i));

		}

		// 12. Write a Java program to remove a specified element from a linked list.

		l_list.remove(4);

		System.out.println("Orange silinince list:" + l_list);

		// 13.Write a Java program to remove first and last element from a linked list.

		l_list.removeFirst();
		l_list.removeLast();

		System.out.println("Ilk ve son elemanlar silinince list:" + l_list);

		// 14-Write a Java program to remove all the elements from a linked list.
		
		l_list.removeAll(l_list);
		System.out.println("Tüm elemanlar silinince list:" + l_list);//[]
		
		//15-Write a Java program of swap two elements in a linked list
		
		LinkedList<String> l_list1 = new LinkedList<String>();

		l_list1.add("Red");
		l_list1.add("Green");
		l_list1.add("Black");
		l_list1.add("Pink");
		l_list1.add("orange");

		System.out.println("Original linked list:" + l_list1);//[Red, Green, Black, Pink, orange]
		
		Collections.swap(l_list1, 0, 2);
		
		System.out.println("Elemanlar yer degistirince list:" + l_list1);//[Black, Green, Red, Pink, orange]
		
		//16-Write a Java program to shuffle the elements in a linked list.
		
		Collections.shuffle(l_list1);
		System.out.println("Elemanlar karistirilinca list:" + l_list1);
		
		//17-Write a Java program to join two linked lists.
		
		LinkedList<Integer> list2 = new LinkedList<Integer>(); 
	     
     	list2.add(5);
		list2.add(6);
		list2.add(7);
		
		LinkedList<Integer> list3 = new LinkedList<Integer>(); 
		
		list3.add(2);
		list3.add(3);
		
		LinkedList<Integer> list4 = new LinkedList<Integer>(); 
		
		list4.addAll(list2);
		list4.addAll(list3);
		
		System.out.println(list4);
		
		//18-Write a Java program to clone an linked list to another linked list.
		
		LinkedList<Integer> list5 = new LinkedList<Integer>(); 
		
		list5=(LinkedList<Integer>) list4.clone();
		
		System.out.println(list5);
		
		//19-Write a Java program to remove and return the first element of a linked list.
		
		System.out.println(list5.pop());//silinecek olan elemani gösterir. removeFirst ile anyi isi yapar
		System.out.println(list5);
		
		
		//20-Write a Java program to retrieve but does not remove, the first element of a linked list.
		
		System.out.println(list5.peekFirst());//ilk elemani getirir ama silmez
		System.out.println(list5);//[6, 7, 2, 3]
		
		
		//21-Write a Java program to retrieve but does not remove, the last element of a linked list.
		System.out.println(list5.peekLast());
		
		//22-Write a Java program to check if a particular element exists in a linked list.
		
		if (l_list.contains("Green")) {
			
			System.out.println("Listte Green var");
			
		} else {
			System.out.println("Listte Green yok");

		}
		
		if (list5.contains(7)) {
			
			System.out.println("Listte 7 var");	
			
		} else {
			System.out.println("Listte 7 yok");

		}
		
		//23-Write a Java program to convert a linked list to array list.
		
		LinkedList <String> linked_list = new LinkedList <String> ();
        linked_list.add("Red");
      linked_list.add("Green");
      linked_list.add("Black");
      linked_list.add("White");
      linked_list.add("Pink");
		
      ArrayList<String> arr1=new ArrayList<String>();
      
      for (String w : linked_list) {
    	  
    	  System.out.print(w+" ");
		
	}
      
      //24-Write a Java program to compare two linked lists.
      
      LinkedList<String> c1= new LinkedList<String>();
      c1.add("Red");
      c1.add("Green");
      c1.add("Black");
      c1.add("White");
      c1.add("Pink");
      
      LinkedList<String> c2= new LinkedList<String>();
      c2.add("Red");
      c2.add("Green");
      c2.add("Black");
      c2.add("Orange");
      
      LinkedList<String> c3= new LinkedList<String>();
      
      
      for (String each : c1) {
    	  
    	c3.add(c2.contains(each) ? "Var" : "Yok");
    	
    	System.out.println(c3);
			
	
		
	}
     
    //25_Write a Java program to test an linked list is empty or not.
      
      System.out.println("Linked list bos mu? :"+c2.isEmpty());
      
      c2.removeAll(c2);
      
      System.out.println("Linked list bos mu? :"+c2.isEmpty());
		
	//26-Write a Java program to replace an element in a linked list.	
      
      System.out.println(c1);
      
      c1.set(2, "White");
      
      System.out.println("Set isleminden sonra : "+c1);

	}

}
