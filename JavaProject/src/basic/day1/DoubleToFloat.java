package basic.day1;
import java.util.Scanner;
public class DoubleToFloat {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number in double: ");
      double d= sc.nextDouble();
      float f=(float)d;
       System .out.println("value of f= "+f);
       System.out.println();
       //float to double
       System.out.println("Enter any number in float: ");
       float f1=sc.nextFloat();
       double d1=(double)f1;
       System.out.println("The double value is: "+d1);
       System.out.println();
       // int to long
       System.out.println("Enter any number in int: ");
       int n=sc.nextInt();
       long l=n;
       System.out.println("The long value is: "+l);
       System.out.println();
       //long to int
       System.out.println("Enter any number in long: ");
       long ln=sc.nextLong();
       int n1=(int)ln;
       System.out.println("The int value is: "+n1);
	}

}