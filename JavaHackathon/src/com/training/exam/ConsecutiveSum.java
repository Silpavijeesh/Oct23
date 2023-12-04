package com.training.exam;
//inputs a positive natural number N and print the possible consecutive number
//combinations. Input:N=9 o/p: 4+5  2+3+4
import java.util.Scanner;

public class ConsecutiveSum {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
for(int i=1;i<=n/2;i++) { //The last number in the list of consecutive numbers that forms the sum=number,cannot be greater than n/2
	int sum=0,x=i;
	String s=" ";//to save the combination
	while(sum<n) {
		sum=sum+x;
		s= s+x+"+";
	    x++;
	}
	if(sum==n)
		System.out.println(s.substring(0,s.length()-1));
}


	}   

}
