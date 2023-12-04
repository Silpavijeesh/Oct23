//Q16) Write a method that will remove given character from a string
package com.training.exam;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String");
     String str=sc.nextLine();
    System.out.println(charRemoveAt( str,7));
	}
  public static String charRemoveAt(String str,int p) {
	  return str.substring(0,p)+str.substring(p+1);
	}

}
