package com.training.exam;
//A circus is designing a tower routine consisting of people standing
// atop one another’s shoulders.each person must be both shorter and lighter than 
//the person below him or her. Given the heights and weights of each person in the 
//circus, write a method to compute the largest possible number of people in such
// a tower. EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95)
// (68, 110) Output: The longest tower is length 6 and includes from top to bottom:
// (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)

import java.util.Map;
import java.util.TreeMap;

public class CircusAsending {

	public static void main(String[] args) {
	TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>();
	tm.put(65,100);tm.put(70,150);tm.put(56,90);tm.put(75, 190);tm.put(60, 95);
	tm.put(68,110);
     for(Integer val:tm.values()) {
     //System.out.println(val);
	}
   System.out.println("The longest tower is length 6 and includes from top to bottom");

   for(Map.Entry treemapdisplay : tm.entrySet()) {
	   System.out.print("("+treemapdisplay.getKey()+","+treemapdisplay.getValue()+") ");

   }

	}
}

	
 
    

	
	
	
		
	


