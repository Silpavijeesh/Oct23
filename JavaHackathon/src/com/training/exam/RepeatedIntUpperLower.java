package com.training.exam;

import java.util.Scanner;
//WJP to find total number of repeated integers, uppercase and lowercase
//character in the give string
public class RepeatedIntUpperLower {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string: "); 
	String str=sc.nextLine();
	System.out.println();
	
	int digitCount=0;
	int uppercaseCount=0;
	int lowercaseCount=0;
	int[] digitArray=new int[10];
	int[] uppercaseArray=new int[26];
	int[] lowercaseArray=new int[26];
	for(int i=0;i<str.length();i++) {
    char ch=str.charAt(i);
    if(ch >= '0' && ch <= '9' ) {
    	digitCount++;
    	digitArray[ch - '0']++;
    }
    else if(ch>='A'&&ch<='Z') {
    	uppercaseCount++;
    	uppercaseArray[ch - 'A']++;
  }
    else if(ch>='a' && ch<='z') {
    lowercaseCount++;
    lowercaseArray[ch - 'a']++;
    } 
	}
   System.out.println("Total no.of integers: "+digitCount); 
   System.out.println("Total no.of uppercase characters: "+uppercaseCount);
   System.out.println("Total no.of lowercase characters: "+lowercaseCount);
   System.out.println();
   
   System.out.println( "Repeated integers count:");
    for(int i=0;i<10; i++) {
    	if(digitArray[i]>1) {
    		System.out.println(i+":"+digitArray[i]);
    	}
    }
    
	}

}
