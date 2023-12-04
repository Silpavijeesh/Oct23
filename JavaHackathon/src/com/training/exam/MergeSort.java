package com.training.exam;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
	int[] arr=new int[100];
	int n;
	Scanner sc=new Scanner(System.in);
			System.out.println("Enter size");
			n=sc.nextInt();
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
     
			mergesort(0,n-1,arr);  //invoking the mergesort method
			System.out.println("Sorted elements are: ");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
	}
	public static void mergesort(int low,int high,int[] arr) {
		if(low<high) {
			int mid=(low+high) / 2;
			mergesort(low,mid,arr);  //first array
			mergesort(mid+1,high,arr);  //2nd array
			merge(low,mid,high,arr);  //merge function
		}
	}
	public static void merge(int l,int m,int h,int[] arr) {
		int i=l,j=m+1,k=l  ;  //l(L) is copied to i,i will keep track of 1st array index.
		int[] arr1=new int[10];  //j will keep track of 2nd array index, k is the new array index.
		while(i<=m && j<=h) {     //if both array is not empty
			if (arr[i]<arr[j]) {  
				arr1[k]=arr[i];
				i++;
				k++;
			}
			else {
				arr1[k]=arr[j];
				j++;
				k++;
			}
		}
		while (i<=m) {     //the first array is not empty till now,2nd array is empty.just copy the 1st array into new array
			arr1[k]=arr[i];  //and increment accordingly.
			i++;
			k++;
		}
		while (j<=h) {       //first array is empty and second array is not empty.copy 2nd array content into new array.
			arr1[k]=arr[j];
			j++;
			k++;
		}
		for(int s=l;s<=h;s++) {  //copying the intermediate result content back to the original array.
			arr[s]=arr1[s];
			}
		}
	}


