package com.training.exam;
//Java pgm to convert string to int
import java.util.Scanner;

public class ConvertStringToInt {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("Enter a number (string):");
String str=sc.nextLine();
//converting String into integer using Integer.parseInt()method
int i=Integer.parseInt(str);
System.out.println("Integer value is: "+i);
	}

}
