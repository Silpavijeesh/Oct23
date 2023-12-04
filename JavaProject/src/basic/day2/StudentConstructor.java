//create a student class with id, name,phone number and country
//create constructors,read the data from user,store 5 student 
//object and print the details in console
package basic.day2;
import java.util.Scanner;
public class StudentConstructor {

	int id;
	 String name;
	 String phonenumber;
	 String country;
	 
	 //constructors with parameters
	 public StudentConstructor (int id, String name, String phonenumber, String country) {
	  this.id = id;
	  this.name = name;
	  this.phonenumber = phonenumber;
	  this.country = country;
	 }
	 
	 void displayinfo() {
	  System.out.println("Student Id: " + id);
	  System.out.println("Student Name: " +name);
	  System.out.println("Student Phonenumber: " +phonenumber);
	  System.out.println("Student Country: " +country);
	 }
	 


	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  
	  StudentConstructor[] students = new StudentConstructor[5];
	  Scanner inputinfo = new Scanner(System.in);
	  
	  
	  for(int i=0; i<2; i++) {
	   
	    System.out.println("Enter Student Id:" ); 
	    int id = inputinfo.nextInt();
	    
	    inputinfo.nextLine();
	    System.out.println("Enter Student Name:" ); 
	    String name = inputinfo.nextLine();
	    
	   
	    System.out.println("Enter PhoneNumber:" ); 
	    String phonenumber = inputinfo.nextLine();
	    
	  
	    System.out.println("Enter Country:" ); 
	    String country = inputinfo.nextLine();
	 
	   
	    
	    students[i] = new StudentConstructor(id,name,phonenumber,country);
	    
	  }
	   for(int i=0; i<2; i++) {
	    students[i].displayinfo();
	    System.out.println();
	    
	  }
}
}