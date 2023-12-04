// Q1)	Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans 
 // are true

package com.training.exam;
import java.util.Scanner;
public class CheckBoolean {
    
	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean c;
		boolean result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three boolean values: ");
         a=sc.nextBoolean();
         b=sc.nextBoolean();
         c=sc.nextBoolean();
		
         if(a) {
        	//if 'a' is true
        	 //and one of the b or c is true.result will be true.
        	 result=b || c;
         }
         else {
        	 // if 'a' is false . one of the ' b' and 'c' will be true.so result is true.
        	 result = b && c;
         }
		if(result) {
			System.out.println("Two boolean variables are true: ");
		}
		else {
			System.out.println("Two boolean variables are  not true: ");
		}
		sc.close();
}
}