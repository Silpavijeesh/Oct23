package basic.day5Assignments;
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
     
			mergesort(0,n-1,arr);
			System.out.println("Sorted elements are: ");
			for(int i=0;i<n;i++) {
				System.out.println(arr[i]);
			}
	}
	public static void mergesort(int low,int high,int[] arr) {
		if(low<high) {
			int mid=(low+high) / 2;
			mergesort(low,mid,arr);
			mergesort(mid+1,high,arr);
			merge(low,mid,high,arr);
		}
	}
	public static void merge(int l,int m,int h,int[] arr) {
		int i=l,j=m+1,k=l  ;
		int[] arr1=new int[10];
		while(i<=m && j<=h) {
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
		while (i<=m) {
			arr1[k]=arr[i];
			i++;
			k++;
		}
		while (j<=h) {
			arr1[k]=arr[j];
			j++;
			k++;
		}
		for(int s=l;s<=h;s++) {
			arr[s]=arr1[s];
			}
		}
	}


