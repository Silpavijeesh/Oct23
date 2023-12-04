//Use Scanner class to accept 3 numbers from the keyboard and print the sum and average of them

import java.util.Scanner;

public class SumAverageExampleScanner{

	public static void main(String[] args) {
		int a,b,c,sum;
		float average;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        sum=a+b+c;
        average=sum / 3;
        System.out.println("Sum of three number is: "+sum);
        System.out.println("Average of three number is: "+average);
        sc.close();
	}
}