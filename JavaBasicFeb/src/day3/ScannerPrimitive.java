//read an int ,double,float, Boolean and print the values,store the values inside variables

package day3;
import java.util.Scanner;

public class ScannerPrimitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int a=reader.nextInt();
		System.out.println("Integer value is: "+ a);
		System.out.println(" Enter a Float Number: ");
		float b=reader.nextFloat(); 
		System.out.println("Float value is: "+b);
		System.out.println(" Enter a Double value:");
		double c=reader.nextDouble();
		System.out.println("Double value is: "+c);
		System.out.println("Enter a Boolean Value:");
		boolean d=reader.nextBoolean();
		System.out.println("Boolean value is: "+d);
		
		reader.close();
		}

}
