package basic.day1;
import java.util.Scanner;
public class Factorial {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	   
	   int factorial=1;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number: ");
	  int num=sc.nextInt();
		for(int i=1;i<=num;i++) {	  
		factorial=factorial*i;
		}
		System.out.println("factorial of the number is: "+factorial);
	}

}
