// java pgm that takes number as input and print its multiplication table.
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int number;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number to print the multiplication table: ");
      number=sc.nextInt();
      for(int i=1; i<=10;i++) {
    	  System.out.println(number +"*" +i +"=" +number*i);
      }
    		  
    		  
    		  
    		  
    		  
    		  
      
	}

}
