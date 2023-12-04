package basic.day4Assignments;
//add sum of the array to each element in the array
import java.util.Scanner;

public class AddSumOfArrayToEachElement {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter array size: " );
	      int n=sc.nextInt();
	      int a[]=new int[n];
	      int Total = 0;
	         
	      System.out.println("Enter array elements: " );
	       
	      for(int i=0;i<a.length;i++){
	          a[i]=sc.nextInt();
	           Total = Total + a[i];
	    
	   }
	      System.out.println(Total);
	      
	      
	      System.out.println("New array elements are: ");
	      int Total1=0;
	     
	      for(int i=0;i<a.length;i++) {
	    	  Total1=Total+a[i];
	       System.out.println(Total1); 
	      }

	 }

	}


