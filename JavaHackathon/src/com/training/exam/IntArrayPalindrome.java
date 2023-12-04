package com.training.exam;
//Given an array of integers check the palindrome of the series.
import java.util.Arrays;
import java.util.Scanner;

public class IntArrayPalindrome {
	
public static void palindrome(int arr[],int n) {
	//check if the first element and last element are different
	//then set flag to 1.
		int flag=0;
		for(int i=0;i<=n/2 &&n!=0;i++) {
			if(arr[i]!=arr[n-i-1]) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("Not palindrome");
		else
			System.out.println("Palindrome");
	}

 
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
			palindrome(arr, n);




		}
	
	}




