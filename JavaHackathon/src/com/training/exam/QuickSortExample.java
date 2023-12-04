package com.training.exam;

import java.util.Arrays;
import java.util.Scanner;
public class QuickSortExample {
static void QuickSort(int[] arr,int low,int high) {
	int mid=low+high/2;
	int i=low;
	int j=high;
	int pivot=arr[mid];
	while(i<=j) { 
		while(arr[i]<pivot) 
			i++;
			
		while(arr[j]>pivot) 
			j--;
		
		if(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	
	if(low<j) //low to j is subarr1  
		QuickSort(arr,low,j);
	if(high>i)  // consider high to i is subarray2.
	QuickSort(arr,i,high);
	
}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
         int n=sc.nextInt();
         int[] arr=new int[n];
         System.out.println("Enter the array elements:");
         for(int i=0;i<n;i++) {
          arr[i]= sc.nextInt();
         }
         System.out.println("Before sort");
         for(int i=0;i<arr.length;i++) {
         System.out.println(arr[i]+"\t");
       
	       }
         QuickSort(arr,0,arr.length-1);
         System.out.println("\nafter sorting: ");
         for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t ");
     }

}
}