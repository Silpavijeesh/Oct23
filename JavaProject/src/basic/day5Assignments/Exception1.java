package basic.day5Assignments;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exception1 {

	public static void main(String[] args) {
		
      int  i=10;
      
    	try {	  
	 System.out.println(i / 0);
    	}
  catch (ArithmeticException e){
	  System.out.println("Don't divide by 0");
  }
      
      int[] a=new int[2];
     System.out.println(a[2]);
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int val=0;
      try {
      val=sc.nextInt();
      }
      catch(InputMismatchException e) {
    	  System.out.println("Sorry you entered wrong format. please enter the number");
      }
      System.out.println("You entered: "+val);
	}

} 
