package com.training.exam;
//Java pgm to differentiate input as string,int or bool.
import java.util.Scanner;

public class DifferentiateInput {
  
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     
        System.out.println(" please enter an input: ");
        if(sc.hasNextInt()) {
        	System.out.println("Entered input is an integer ");
        }
        else if(sc.hasNextBoolean()) {
     	   boolean bn=sc.nextBoolean();
     	   if(bn==true) 
         	System.out.println("Entered input is boolean ");
     	   else if(bn==false)
     	  
     		   System.out.println("boolean");
     	   }
       
        else {
        	String string=sc.nextLine();
        	if(string.length()>1) {
        	System.out.println("Entered input is a String");
        }
        	
       
        	sc.close();
        }
	}

}
