package com.training.exam;
import java.io.*;
import java.util.Scanner;

public class StringUniqueWords{
	public static void main(String[] args) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		str=sc.nextLine();
		//splitting the string by space and storing into string array.
	String newStr[]=str.split(" ");
	System.out.println("The unique words of this string are: ");
	
	for(int i=0;i<newStr.length;i++) {
	
		for(int j=0;j<newStr.length;j++) {
		 //storing the string value in temporary variable
			String temp1=newStr[i];
			String temp2=newStr[j];
			
	/*if second loop encounter same value again but j<i	break the loop to
			//avoid printing of duplicate value.*/
			
			if(j<i && temp1.equals(temp2)) {
				break;
			}
			
			/*while traversing the array,if loop reached to last print the
		string with its number of count*/
			if(j==newStr.length-1) {
				System.out.println(newStr[i]);
			}
			}
	}
		}
}

