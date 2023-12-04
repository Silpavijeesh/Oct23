package com.training.exam;

import java.util.Scanner;

//Wjp to display duplicate character in a string
public class DisplayDuplicateChar {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string: ");
    String str=sc.nextLine();
    char[] ch=str.toCharArray();//converts the string in to sequence of 
                                 //characters.
    System.out.println("Duplicate characters in the string are: ");
    for(int i=0;i<str.length();i++) {
    	for(int j=i+1;j<str.length();j++) {
    		if(ch[i]==ch[j]) {
    			System.out.print(ch[j]+" ");
    			break;
    		}
    	}
    }
    
    
	}

}
