package com.training.exam;

import java.util.Arrays;
import java.util.Scanner;
public class MergeTwoSortdArrays {
	// Java program to merge two sorted arrays.(Do not use third array)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a1=new int[10];
		int len=a1.length;
		System.out .println("Enter the size of the arrys: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		 System.out.println("Enter the Elements of the first array");
		      for(int i=0;i<n1;i++) {
		    	  a1[i]=sc.nextInt();
		      }
		    	  //int a1={1,2,4,6,9,10,0,0,0,0}
		      // int a2= {3,5,7,8};
		      int[] a2=new int[n2];
		      System.out.println("Enter the Elements of the second array");
		      
		      for(int i=0;i<a2.length;i++) {
		    	  a2[i]=sc.nextInt();
		    	  a1[i+6]=a2[i];
		      }
		      Arrays.sort(a1);//sorting the new merged array
	      System.out.println("Merged array: ");
	      for(int s1:a1) {
	    	  System.out.println(s1);
	      }
	      sc.close();
	    }
}


