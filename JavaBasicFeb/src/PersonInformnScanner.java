//Accept name,age,gender,address(single line) of a person from the user and print them in separate lines

import java.util.Scanner;

public class PersonInformnScanner {

	public static void main(String[] args) {
	System.out.println("Enter your details-------------- ");
  Scanner sc=new Scanner(System.in);
  System.out.println("Please enter your name: ");
  String name=sc.nextLine();
  System.out.println("Name is: "+name);
  System.out.println("Enter your age: ");
  int age=sc.nextInt();
  System.out.println("Age is: "+age);
  System.out.println("Enter your gender: ");
  String gender=sc.next();
  System.out.println("Gender is: "+gender);
  System.out.println("Enter your address--------- ");
  System.out.println("Enter your housenumber,streetname,city and country");
  String hnum=sc.next();
  String streetName=sc.next();
  String city=sc.next();
  String country= sc.next();
		 
  System.out.println("Address is------------");
   System.out.println("House number is: "+hnum+ "\n" + "Street name is: "+streetName+"\n"+"City is: "+city+"\n"+"Country is: "+country );
		  
	sc.close();	  
		  
  
	}

}
