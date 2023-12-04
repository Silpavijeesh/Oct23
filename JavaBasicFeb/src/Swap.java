 // Java program to swap to variables
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int x=100 , y=200 ;
    System.out.println("Before swap");
    System.out.println("x=" +x);
    System.out.println("y=" +y);
    
    int temp=x;
    x=y;
    y=temp;
    System.out.println("After swap");
    System.out.println("x=" +x);
    System.out.println("y=" +y);
	}

}
