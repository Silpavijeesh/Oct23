package com.training.exam;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array: ");
	n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter the array elements: ");
	for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
	}
		Arrays.sort(a);
		int count=1;
		for(int i=0;i<a.length;i++) {
			while((i+1) <= a.length-1 && a[i]==a[i+1]){
				count++;
				i++;
			}
			if (count==1)
				System.out.println("element is: "+a[i]+" is unique");
	   else
	System.out.println("element is: "+a[i]+" and no.of occurance is: "+count);
			count=1;
				
			
		}
	}

	}


