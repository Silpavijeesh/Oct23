//pgm to print the area of two rectangles having sides(4,5) and(5,8)rsply by creating a class named Rectangle with
// a method named Area which returns the area and length and breadth passed as parameters to its constructor.
class Rectangle{
	int length;
	int breadth;

	public Rectangle(int l,int b) {
		length=l;
		breadth=b;
	}
	public int Area() {
		return length*breadth;
	}
}
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle a=new Rectangle(4,5);
		Rectangle b=new Rectangle(5,8);
        a.Area();
        b.Area();
        System.out.println("Area of the Rectangle1 is: "+a.Area());
        System.out.println("Area of the Rectangle2 is: "+b.Area());
	}
	

}
