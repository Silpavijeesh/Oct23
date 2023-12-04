package com.training.exam;
//Q6) java pgm to perform ascending order selection sort{64,25,12,22,11}
import java.util.Scanner;

public class SelectionSortExample {

	public static void main(String[] args) {
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Sorting array using selection sort technique..\n");
		for(int i=0;i<arr.length-1;i++) {
			int min_index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min_index]>arr[j]) {
					min_index=j;
				
			}
			}
					temp=arr[min_index];
					arr[min_index]=arr[i];
					arr[i]=temp;
				
			}
		
		
		System.out.println("The array after sorting is: \n");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");		
	}
    System.out.println();
}
}