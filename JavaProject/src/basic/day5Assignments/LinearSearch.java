package basic.day5Assignments;
//Linear or Sequential search
import java.util.Scanner;

public class LinearSearch {
 public static void sequential(int low,int high,int key,int[] a) {
	 int i;
	 for(i=low;i<=high;i++) {
		 if(a[i] == key) {
			 System.out.println("Element present in the list");
			 break;
		 }
		 
		 }
		 
	 if(i>high)
		 System.out.println("Element is not present in the list");
		
	 }
 
	public static void main(String[] args) {
		int n=0,key=0;
		
     Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the length of the array: ");
		 n=sc.nextInt();
		 
		 int[] a=new int[n];
		 System.out.println("Enter the array elements in ascending order: ");
		 for(int i=0;i<a.length;i++) {
			 a[i]=sc.nextInt();
		 }
		 System.out.println("Enter the key:");
		 key=sc.nextInt();
		 sequential(0,n-1,key,a);
	}
	
		 
	}


