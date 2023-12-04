package basic.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> ob=new Vector<Integer>();  //initial size will be 10. next time increase by 100%. ie 10+10=20 is 
		                                           //the next size.   
		  ob.add(2);    //autoboxing. 2will be converted into Integer type.
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
		 
		 ArrayList<Integer> ob2=new ArrayList<>(ob);//all the elements available in the vector(ob) will be copied to arraylist..
		 System.out.println(ob2);
		 ob.remove(0); //remove from position (index 0) 
		 ob.remove(null); //remove element
		 System.out.println(ob);
		 
		 
	}



	}


