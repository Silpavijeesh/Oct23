package basic.day6;

import java.util.LinkedList;

public class DataTest3 {

	public static void main(String[] args) {
		  //  LinkedList<E>    //To import Linkedlist inbuilt class from java.util.package.mouse hover on Linkedlist. Tnen cntrl space
	       
	      LinkedList list=new LinkedList();
	      list.add(10);
	      list.add("tekarch");
          list.add(2, 28);
          list.addFirst(3);
          list.addLast("ammu");
         // list.clear(); //shows [] (empty list)
          list.contains(4);
          
          
System.out.println(list);

	}

}