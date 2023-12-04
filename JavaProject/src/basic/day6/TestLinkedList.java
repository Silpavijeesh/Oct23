package basic.day6;
//maintaining insertion oder and allow duplicates
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
	LinkedList<Integer> ob=new LinkedList<>(); //initial size is zero..  
		  ob.add(2);    //autoboxing 2will be converted into Integer type.
		  ob.add(67);
		  ob.add(2);
		  ob.add(67);
		  ob.add(67);
		  ob.add(52);
		  ob.add(null);
		  ob.add(null);
		  Iterator<Integer> it= ob.iterator(); //iterator() return Iterator<Integer> 'it' is the variable.
		    while(it.hasNext()) {  
		  System.out.println(it.next());
		 
		  
			}
		 System.out.println(ob);
		 System.out.println(ob.size());
		 //ob.clear();
		 //System.out.println(ob);//empty arraylist
		 
		 ArrayList<Integer> ob2=new ArrayList<>(ob);//all the elements available in the linkedlist(ob) will be copied to arraylist..
		 System.out.println(ob2);
		 ob.remove(0); //remove from position (index 0) from ob ie linkedlist
		 ob.remove(null); //remove element
		 System.out.println(ob);
		 ob.addFirst(5); //from linkedlist(becoz ob.addFirst)means insert at first and 
		 System.out.println(ob);
		  ob.addLast(9); //addLast() u can insert at last
		 System.out.println(ob);
         // ob.descendingIterator();
		 ob.getFirst();
          System.out.println(ob);
          ob.getLast();
          System.out.println(ob);
	}

}
