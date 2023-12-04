package com.training.exam;
//Wjp to find factorial of a number using recursion
import java.util.Scanner;

public class FactorialRecursion {  // a method that calls itself is called recursion

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		long factorial=fact(num); //fact(5)
		System.out.println("Factorial of " + num + " = " +factorial);
	}
	public static long fact(int num)
	{
		if(num>=1)
			return num* fact(num-1);  

		else
			return 1;
	
	}

}
