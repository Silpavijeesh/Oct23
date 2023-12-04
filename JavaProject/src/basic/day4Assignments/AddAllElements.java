package basic.day4Assignments;
import java.util.Scanner;
public class AddAllElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter number of elements to be calculated: ");
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		int[] arr=new int[n]; //creating n-size array
		for( i=0;i<n;i++) { //entering n numbers in an array
			System.out.println("\n Enter: ");
			arr[i]=sc.nextInt();
		}
		System.out.println();
		
			for( i=0;i<n;i++) {
		    System.out.print(arr[i]);
		    sum=sum+arr[i];
		    
		    if(i < (n-1))
		    System.out.println("+")	;
		    else
		    	System.out.println("=");
			}
			System.out.println(sum);
		    	
		
		}
				

	}


