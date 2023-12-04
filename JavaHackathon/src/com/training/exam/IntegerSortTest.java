//Given an array of integers,sort the integer values.

package com.training.exam;
import java.util.Arrays;
import java.util.Scanner;
 import java.util.Scanner;
public class IntegerSortTest{

	public static void main(String[] args) {
		int n,temp;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of the array: ");
           n=sc.nextInt();
           int[] arr=new int[n];
           System.out.println("Enter the elements in to the array");
           for(int i=0;i<n;i++) {
        	   arr[i]=sc.nextInt();
        	   
           }
           for(int i=0;i<arr.length;i++) { //holds each array element
        	   for(int j=i+1; j<arr.length;j++) { //compare with the remaining
        		   if (arr[i]>arr[j]) {         //array elements
        			   temp=arr[i];
        			   arr[i]=arr[j];
        			   arr[j]=temp;
        		   }
        		   }
           }
           System.out.println();
        	   System.out.println("sorted order of the Integer array is: ");
        	   for(int i=0;i<arr.length;i++) {
        		   System.out.print(arr[i]+" ");
        	   }
        	 sc.close(); 
           }
	
}  
     		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
        		   
           
           
	


