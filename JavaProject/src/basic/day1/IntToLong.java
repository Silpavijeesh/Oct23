package basic.day1;
import java.util.Scanner;

public class IntToLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any  integer value: ");
		int i=sc.nextInt();
		long l= Long.valueOf(i);// long l=i;//
		System.out.println("The value of l is: "+l);
		
		

	}

}
