//Program to print the first big,second big,third biggest number(use scanner method)
import java.util.Scanner;
public class LargestScannerMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the elements of the array: ");
		   for(int i=0;i<a.length;i++) {
	         a[i]=sc.nextInt();
		   }
		   System.out.println("Array is: ");
		   for(int i=0;i<a.length;i++) {
			   System.out.print(a[i]+" ");
		   }
			   System.out.println();
			   if(a.length>=3) {
			   
		   }
        int fMax= a[0];
        int secMax=a[0];
        int thirdMax=a[0];
        for(int i=0;i<a.length;i++) {
     if (a[i]>fMax) {
    	thirdMax= secMax;
        secMax=fMax;
        fMax=a[i];
     }
     else if( a[i]>secMax) {
    	 thirdMax=secMax;
    	 secMax=a[i];
     }
     else if(a[i]>thirdMax) {
    	 thirdMax=a[i];
     }
     }
       System.out.println("The max of the given array is: "+fMax);
       System.out.println("The secondmax of the given array is: "+secMax);
       System.out.println("The thirdmax of the given array is: "+thirdMax);
     }
	}


