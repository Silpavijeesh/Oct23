package basic.day4Assignments;

import java.util.Scanner;

public class MoveEvenNumbersToBeginningOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
	    int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			//int[] a={2,7,3,5,6,3,4]
		}
		
		
		int i=0;
		for(int j=0;j<a.length;j++) {
			if (a[j]%2==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}	
			}
		
			System.out.println("resultant array= ");
			for(int j=0;j<a.length;j++){
				System.out.println(a[j]+ " "); 
				
			}

	}

}
