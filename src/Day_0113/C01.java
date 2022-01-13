package Day_0113;

import java.util.Iterator;
import java.util.LinkedList;

public class C01 {

	public static void main(String[] args) {
		//1. Write a Java program to append the specified element to the end of a linked list.
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Green");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		list.add("Black");
		list.add("White");
		
		System.out.println(list);
		
		//2. Write a Java program to iterate through all elements in a linked list.
		
		for (String w : list) {
			System.out.print(w+" ");
			
			
			
		}
		System.out.println();
		
		//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
		
		Iterator p=list.listIterator(1);
		
		while (p.hasNext()) {
			System.out.print(p.next()+" "); //1.elemandan sonrakileri yazdirdik.
		}
		System.out.println();
		
		//4. Write a Java program to iterate a linked list in reverse order.
		
		 System.out.println("Original linked list:" + list);  
		 
		    Iterator it = list.descendingIterator();

		     // Print list elements in reverse order
		     System.out.println("Elements in Reverse Order:");
		     while (it.hasNext()) {
		        System.out.println(it.next());
		     }
		
		
		//5. Write a Java program to insert the specified element at the specified position in the linked list.
		     
		     System.out.print("Original linked list:" + list);  
		     
		     list.add(3, "Orange");
		     
		     System.out.println("");
		     
		     System.out.print("Eklemeden sonraki list:" + list); //3.elemandan sonra yeni bir eleman ekledik
		     
		
		//6. Write a Java program to insert elements into the linked list at the first and last position.
		     
		     list.addFirst("Purple");
		     list.addLast("Pink");
		     
		     System.out.println(" ");
		     
		     System.out.println("Linkedin son hali + "+list);
		     
		 //7. Write a Java program to insert the specified element at the front of a linked list.
		     
		     LinkedList<String> list1 = new LinkedList<String>(); 
		     	
		     	list1.add("Green");
				list1.add("Yellow");
				list1.add("Red");
		     System.out.println(list1);
		     System.out.println("");
		     
		     list1.offerFirst("Blue");
		     System.out.println(list1);
		     
		//8. Write a Java program to insert the specified element at the end of a linked list.	
		     
		     list1.offerLast("Black");
		     System.out.println("");
		     
		    
		     System.out.println(list1);
		     
		    // 9. Write a Java program to insert some elements at the specified position into a linked list. 
		     
		     LinkedList<Integer> list2 = new LinkedList<Integer>(); 
		     
		     	list2.add(5);
				list2.add(6);
				list2.add(7);
				
				LinkedList<Integer> list3 = new LinkedList<Integer>(); 
				
				list3.add(2);
				list3.add(3);
		    
		    list3.addAll(1, list2);
		     System.out.println("");
		     
			    
		     System.out.println(list3);//list2ün 1.indexine list 2yi ekledik
		     
		     //10. Write a Java program to get the first and last occurrence of the specified elements in a linked
		     
		     Object ilkEl= list.getFirst();
		     Object sonEl= list.getLast();
		     System.out.println("");
		     
			    
		     System.out.println(ilkEl);
		     System.out.println("");   
		     System.out.println(sonEl);
		     
		
	}

}
