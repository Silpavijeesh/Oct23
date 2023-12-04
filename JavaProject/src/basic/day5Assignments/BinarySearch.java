package basic.day5Assignments;
import java.util.Scanner;

public class BinarySearch {
	public static void binary(int low,int high,int key,int[] a) {
  int mid;
  while(low <= high) {
	  mid=(low+high) / 2;
	  
	  if(a[mid] == key) {
		  System.out.println("Elements present in the list");
		  break;
		  }
	  else if(a[mid]>key)
		  high=mid-1;
	  
	  else if(a[mid] < key)
		  low=mid+1;
	  
  }
  if(low>high)
	  System.out.println("Elements not present in the list");
	  
		  
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
		 binary(0,n-1,key,a);
	}
	
		 }


	


