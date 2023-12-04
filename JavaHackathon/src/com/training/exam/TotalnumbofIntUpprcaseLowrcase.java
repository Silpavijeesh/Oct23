package com.training.exam;
//Wjp to find total no.of integers,uppercase,lowercase character in a
//given string
import java.util.Scanner;

public class TotalnumbofIntUpprcaseLowrcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s=sc.nextLine();
		int i,l,c1=0,c2=0,c3=0;//c1,c2,c3 are counters
		char ch;
		l=s.length();
		for(i=0;i<l;i++) {
			ch=s.charAt(i);//0th char
			if(Character.isLowerCase(ch)) 
				c1++;
			
			else if(Character.isUpperCase(ch))
                c2++;
			else if(Character.isDigit(ch))
				c3++;
		}
       System.out.println("Number of lowercase letter is: "+c1);
       System.out.println("Number of uppercase letter is: "+c2);
       System.out.println("Number of digit is: "+c3);
	}

}
