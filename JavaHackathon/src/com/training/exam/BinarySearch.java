package com.training.exam;
import java.util.Scanner;
public class BinarySearch {
public static void binary(int low,int high,int key,int[] a)	{
	int mid;  //divide the array by mid value,compare mid value with key. if it is equal return true.
	while(low<=high) {
		mid=(low+high)/2;
		if(a[mid]==key) {
			System.out.println("Element present in the list");
			break;
			}
		else if(a[mid]>key)  //if mid element is greater than key,neglect right part elements and continue with left part elements.
			high=mid-1;
		else if(a[mid]<key)
			low=mid+1;
		}
	if(low>high)
		System.out.println("Elements not present in the list");
	
  }
	public static void main(String[] args) {
    int n=0,key=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of the array");
    n=sc.nextInt();
    int[] a=new int[n];
    System.out.println("Enter the array elements in ascending order");
    for(int i=0;i<a.length;i++) {
    	a[i]=sc.nextInt();
    }
    System.out.println("Enter the key");
    key=sc.nextInt();
    binary(0,n-1,key,a);
    }
    }


