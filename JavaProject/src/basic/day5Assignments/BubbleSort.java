package basic.day5Assignments;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("Enter the number of elements: ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the array contents: ");
		for(int i=0; i<num;i++) { //read elements from user input//
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<num-1;i++) {  //array for pass//
			for(int j=0;j<num-1-i;j++) { //array for comparison//
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
			
			
				}
			}
		
		

	}


