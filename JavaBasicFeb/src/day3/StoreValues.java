package day3;
import java.util.Scanner;
public class StoreValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner reader=new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a=reader.nextInt();//it will read first integer store in a.
    System.out.println("\nEnter the second number: ");
    int b=reader.nextInt();
    int sum= a+b;
    System.out.println("\nSum of two number is: "+sum);
    reader.close();
	}

}
