package com.training.exam;

import java.util.Scanner;

public class PalindromeNumbAndString {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String s=sc.nextLine();
    char[] ch=s.toCharArray();
    int n=ch.length;
    boolean flag=true;
    for(int i=0;i<n/2;i++) {
    	if(ch[i]!=ch[n-1-i]) {
    		flag=false;
    		break;
    		
    	}
    }
   if(flag==false)
   System.out.println(s+" is not palindrome");
   else
	   System.out.println(s+" is  palindrome");
	}

}
