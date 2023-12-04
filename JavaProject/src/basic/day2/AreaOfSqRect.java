package basic.day2;

//import basic.Day2assignments.overload;

class overload1{
	void area(int l,int b) {
	      System.out.println("The area of the rectangle is: "+(l*b));
	   }
	   void area(int l) {
		   System.out.println("The area of the square is: "+(l*l)); 
	   } 
}
public class AreaOfSqRect {
	public static void main(String[] args) {
	overload1 obj=new overload1();
    obj.area(10,20);
    obj.area(10);
}

}

