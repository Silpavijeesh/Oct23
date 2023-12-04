//Q13. Given a String. print the reverse of the string

package com.training.exam;
import java.util.Scanner;
public class Reverse1Example {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	System.out.println("Input a string: ");
	char[] letters=sc.nextLine().toCharArray();
	System.out.println("Reverse a string: ");
	for(int i=letters.length-1;i>=0;i--) {
		System.out.print(letters[i]);
	}
    System.out.println();
	}

}
