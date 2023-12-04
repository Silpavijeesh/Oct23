//Pgm To Find the factorial(non recursive)
package com.training.exam;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {

int num;
long factorial=1;//initialize one because it will not impact final result.
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
num=sc.nextInt();
sc.close();

for(int i=1;i<=num;i++) {
	factorial= factorial*i;
	
}
System.out.println("Facorial is: "+factorial);
	}

}
