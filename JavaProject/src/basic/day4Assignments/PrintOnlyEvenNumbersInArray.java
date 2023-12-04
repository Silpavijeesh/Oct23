package basic.day4Assignments;
//Print only even numbers in the given array
import java.util.Scanner;
public class PrintOnlyEvenNumbersInArray {

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
	
	for(int i=0;i<a.length;i++) {  //here to traverse from 0 to(n-1)
	if (a[i]%2==0)
		System.out.println(a[i]+" is an even number number");
	}
	}

}
