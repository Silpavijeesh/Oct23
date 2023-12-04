//pgm to print the area and perimeter of a triangle having sides 3,4,5units.
//create a class named triangle without any parameter in its constructor
public class Triangle {
	int a;
	int b;
	int c;
	double s;
	float area;
	double perimeter;
  public void calcPerimeter() {
	  perimeter=(a+b+c);
  }
  public void calcArea() {
	 s= (a+b+c)/2;
	  area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
	  
  }
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		t1.a=3;
		t1.b=4;
		t1.c=5;
		t1.calcArea();
		t1.calcPerimeter();
		 System.out.println("Area of the Triangle is: "+t1.area);
		 
		 System.out.println("Perimeter of the Triangle is: "+t1.perimeter);
		 
		 
	}

		

	}


