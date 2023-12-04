//use Scanner class to perform some arithmetic

import java.util.Scanner;

public class ScannerArithmetic {

	public static void main(String[] args) {
		int first,second,add,subtract,multiply;
		float divide;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		first=sc.nextInt();
		second=sc.nextInt();
		add=first+second;
		subtract=first-second;
		multiply=first*second;
		divide=first/second;
		
	System.out.println("Sum is: "+add);
	System.out.println("Difference is: "+subtract);
	System.out.println("Multiplication is: "+multiply);
	System.out.println("Division is: "+divide);
		

	}

}
