package day3;
import java.util.Scanner;
public class SwapTwoVariables {
	public static void main(String[] args) {
	int a, b ;
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Before swap: ");
		System.out.println("Enter the value in a: ");
		a=sc.nextInt();
		System.out.println("Enter the value in b: ");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swap: ");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
