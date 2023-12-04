//To find the fibinocci series of size n.
package basic.day2;
import java.util.Scanner;
 public class Fibinocci {
  
 static void printFibinocci(int n)
  {
	 int n1=0,n2=1;
	 int counter=0;
	//iterate till counter is n.
	 while(counter<n) {
		 System.out.print(n1+" "); //print the number.then swap n2 to n1 and n3 to n2.
	 int n3=n1+n2;
	 
	 n1=n2;
	 n2=n3;
	 counter=counter+1;
			 
	  }
  }
			 
	 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int n=sc.nextInt();
	 
	printFibinocci(n);
 }
 }