//swap two variables without using third variable
package day3;
import java.util.Scanner;
public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value in a: ");	
		 a=sc.nextInt();
		System.out.println("Enter value in b: ");
		 b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap: ");
	System.out.println("a= "+a);
	System.out.println("b= "+b);
		
		

	}

}
