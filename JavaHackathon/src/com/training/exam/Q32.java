package com.training.exam;
//You are given two sorted arrays, A and B, and A has a large enough buffer at the end to hold B.
// Write a method to merge B into A in sorted order?
/*One way is to merge the two arrays by inserting the smaller elements in front
 of A, but the issue with this approach is that we have to shift every
element to right after every insertion.
So, instead of comparing which one is a smaller element, we can compare which
 one is larger and then insert that element into the end of A.*/
public class Q32 {
	static int NA=-1;
	static void sortedMerge(int a[],int b[],int n,int m) {
	   int i=n-1;
		int j=m-1;
		int lastIndex=n + m - 1; //5+5 -1=9
	// merge a and b,starting from last element in each	
		while(j>=0)
	//End of a is greater than end of b
			{
			if(i>=0 &&a[i]>b[j]) {
                //copy element
				a[lastIndex]=a[i];
				i--;
			}
			else {
				//copy element
				a[lastIndex]=b[j];
				j--;
				}
			//move indices
			lastIndex--;
			}
	}
	//Helper function to print the array
	static void printArray(int arr[],int n)
	{
		System.out.println("Array a after merging b in sorted order: ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");
		}
	public static void main(String[] args) {
	int a[]= {10,12,13,14,18,NA,NA,NA,NA,NA};
	int n=5;
	int size_a=10;
	int b[]= {16,17,19,20,22};
	int m=5;
	sortedMerge(a,b,n,m);
	printArray(a,size_a);
	}
	}
