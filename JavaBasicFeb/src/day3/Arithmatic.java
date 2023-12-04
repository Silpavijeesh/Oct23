package day3;
import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner reader=new Scanner(System.in);
      int num1, num2;
      System.out.println("Enter two numbers: ");
      num1=reader.nextInt();
      num2=reader.nextInt();
     System.out.println("\nAddition: "+(num1+num2)); 
      System.out.println("\nSubtraction: "+(num1-num2));
      System.out.println("\nMultiplication: "+(num1*num2));
      System.out.println("\nDivision: "+(num1/num2));
      System.out.println("\nModulus: "+(num1%num2));
      reader.close();
	}

}
