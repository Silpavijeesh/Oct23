package com.training.exam;

import java.util.Scanner;

public class ReverseStringExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Original String is: ");
		String originalStr=sc.nextLine();
		sc.close();
		String words[]=originalStr.split("\\s");
		String reverseString=" ";
		//reverse each word's position
		for(int i=0;i<words.length;i++) {
			if(i==words.length-1)
				reverseString=words[i]+reverseString;
			else
				reverseString=" " +words[i]+reverseString;
		}
		//displaying the string after reverse
		System.out.println("Reverse string is: "+reverseString);
		
		
		}

	}


