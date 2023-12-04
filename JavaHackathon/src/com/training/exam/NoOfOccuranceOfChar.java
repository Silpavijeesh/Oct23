package com.training.exam;

import java.util.Scanner;

//WJP to display number of occurrence of all character
public class NoOfOccuranceOfChar {

	public static void main(String[] args) {
		int i,length;
		int counter[]=new int[256];//to count the frequency of characters
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		length=str.length();
		for(i=0;i<length;i++) {
		counter[(int)str.charAt(i)]	++; //initialize frequency array element with 
		                                //zero
		}
		for(i=0;i<256;i++) {
			if(counter[i]!=0) {
				System.out.println((char)i +" -->" +counter[i]);
			}
		} 
		
				
		

	}

}
