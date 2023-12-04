package basic.day1;
import java.util.Scanner;
public class MaxOfTwo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number:");
     int num1=sc.nextInt();
     System.out.println("Enter the second number:");
     int num2=sc.nextInt();
     if(num1>num2)
    	 System.out.println("Maximum number is: "+num1);
     else
    	 System.out.println("Maximum number is: "+num2);
	}
}
	