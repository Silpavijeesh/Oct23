package basic.day2;
//Method to check century year,leap year or not?
import java.util.Scanner;
public class LeapYearCenturyYear {
   public static void  checkCenturyYearLeapYear(int year) {
	if(year%100==0) {
		if(year%400==0) {
		System.out.println(year+" is a century year & a leap year");
		}
		else {
			System.out.println(year+" is a century year but not a leap year");
		}
	}
	else if(year%4==0) {
		System.out.println(year+" is a leap year");
	}
	else {
		System.out.println(year+" is not a leap year");
	}
		
		}
	
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.println("Check leap year,century year or not: ");
   System.out.println("--------------------------------------");
   System.out.println("Enter the year: ");
   int year=sc.nextInt();
   checkCenturyYearLeapYear(year);
   
   
	}

}
