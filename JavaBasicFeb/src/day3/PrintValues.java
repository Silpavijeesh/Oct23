package day3;
import java.util.Scanner;
public class PrintValues {
public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;
float b;
String s;
boolean d;
Scanner sc=new Scanner(System.in);// create e an object.
System.out.println("Enter a string:");
s= sc.nextLine();// take string input and assign to variable.
System.out.println("\nYou entered String: "+s);//print.

System.out.println("\nEnter an Integer: ");
a=sc.nextInt();
System.out.println("\nYou entered an Integer: "+a);

System.out.println("\nEnter a Float value: ");
b=sc.nextFloat();
System.out.println("\nYou entered a Float value: "+b);

System.out.println("\nEnter a Boolean value:");
d=sc.nextBoolean();
System.out.println("\nYou enterd a Boolean value: "+d);
	}

}
 