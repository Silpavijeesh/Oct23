package com.training.exam;

import java.util.Scanner;

//WJP to convert int to string
public class ConvertIntToString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
        String str=String.valueOf(a);
        System.out.println("String value is: "+str);
	}

}
