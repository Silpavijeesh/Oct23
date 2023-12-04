package basic.day2;

import java.util.Scanner;

class Shape{
		float findArea(float l,float b) {
		return l*b;
		}
		float findArea(float len) {
			return len*len;
		}

	}
	public class FindAreaUsingMethodOverloading {
	public static void main(String[] args) {
		Shape obj=new Shape();
		Scanner sc=new Scanner(System.in);
		System.out.println("To find the area of the rectangle: ");
		System.out.println("Enter the length: ");
	    float l=sc.nextFloat();
	    System.out.println("Enter the breadth: ");
	    float b=sc.nextFloat();
	    
	    System.out.println("To find the area of the square: ");
	    System.out.println("Enter the length: ");
	    float len=sc.nextFloat();
	    
	    System.out.println("Area of Rectangle= "+obj.findArea(l,b));
	    System.out.println("Area of Square= "+obj.findArea(len));
		}
	}


