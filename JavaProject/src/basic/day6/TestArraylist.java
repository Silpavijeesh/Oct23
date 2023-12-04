package basic.day6;

import java.util.ArrayList;  //allow duplictes and maintain insertion order.
import java.util.Collections;
import java.util.Iterator;

public class TestArraylist {

	public static void main(String[] args) {
  ArrayList<Integer> ob=new ArrayList<>(); //initial size is 10.  
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
 
 ArrayList<Integer> ob2=new ArrayList<>(ob);//all the elements available in ob will be copied to ob2.
 System.out.println(ob2);
 ob.remove(0); //remove from position (index 0)
 ob.remove(null); //remove element
 System.out.println(ob);
 
}
} 