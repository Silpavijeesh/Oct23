package basic.day2;
//print following pattern. a) if n=4 then o/p=6,9,12,15
//b) if n=5 then o/p=1,4,7,10,13   c) if n=5 then o/p=0,4,8,12,16

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
        int n=sc.nextInt( );
        printpattern1(n);
         System.out.println();
         
         System.out.println("Enter the number: ");
         n=sc.nextInt();
         printpattern2(n);
         System.out.println();
          
          System.out.println("Enter the number: ");
           n=sc.nextInt();
          printpattern3(n);
           System.out.println();
           sc.close();
          }
 // a) if n=4 then o/p=6,9,12,15
   public static void printpattern1(int n) {
	   int num=6;
	   for(int i=0;i<n;i++) {
		   System.out.print(num+",");
		   num+=3; //num=num+3
	   }
	   System.out.println();
   } 
	   
	// b) if n=5 then o/p=1,4,7,10,13
   public static void printpattern2(int n) {
	  int num=1;
	  for(int i=0;i<n;i++) {
		  System.out.print(num+",");
		  num+=3; //num=num+3
	  }
	  System.out.println();
   } 
	// c) if n=5 then o/p=0,4,8,12,16
	  public static void printpattern3(int n) {
		  int num=0;
		  for(int i=0;i<n;i++) {
			  System.out.print(num+",");
			  num+=4; //num=num+4
	  }
		  System.out.println();
   }


	}


