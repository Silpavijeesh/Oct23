package com.training.exam;

import java.util.Arrays;
import java.util.Scanner;
class Quicksort{
	//method to find the partition position
	static int partition(int array[],int low,int high) {
		//choose the rightmost element as pivot
		int pivot=array[high];
		//pointer for greater element
		int i=(low-1);
		for(int j=low;j<high;j++) {
			if(array[j]<=pivot) { //if element is smaller than pivot is found
				i++;  //swap it with greater element pointed by i
				// swapping element at i with element at j
		        int temp = array[i];
		        array[i] = array[j];
		        array[j] = temp;
		      }

		    }
   
		    // swap the pivot element with the greater element specified by i
		    int temp = array[i + 1];
		    array[i + 1] = array[high];
		    array[high] = temp;

		    // return the position from where partition is done
		    return (i + 1);
		  }

		  static void quickSort(int array[], int low, int high) {
		    if (low < high) {
		    	// find pivot element such that
		        // elements smaller than pivot are on the left
		        // elements greater than pivot are on the right
		        int pi = partition(array, low, high);
		        
		        // recursive call on the left of pivot
		        quickSort(array, low, pi - 1);

		        // recursive call on the right of pivot
		        quickSort(array, pi + 1, high);
		      }
		    }
}
			
			
	public class AscendingOrderQuickSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the array");
         int s=sc.nextInt();
         int[] data=new int[s];
         System.out.println("Enter the array elements:");
         for(int i=0;i<s;i++) {
          data[i]= sc.nextInt();
         }
         System.out.println("Unsorted array");
         System.out.println(Arrays.toString(data));
         int size=data.length;
         //call quicksort() on array data
         Quicksort.quickSort(data, 0,size-1);
         System.out.println("Sorted array in ascending order");
         System.out.println(Arrays.toString(data));
	}
         
	}


