//Assign and print the roll_num,ph_num,address of two students having names  Sam and John resply by creating an object of the
//class student
class Student1{
	int roll_num;
	long ph_num;
	String address;	
}
public class TestStudent1 {

	public static void main(String[] args) {
		Student1 Sam=new Student1();
		Student1 John=new Student1();
		Sam.roll_num=2;
	    Sam.ph_num=2488888873L;
	    Sam.address= " USA!";
	    
	    John.roll_num=3;
	    John.ph_num=345667888888L;
	    John.address= "3245,RRRRkS,Japan";
	    System.out.println(Sam.roll_num +" "+Sam.ph_num+" "+Sam.address);
	    System.out.println(John.roll_num +" "+John.ph_num+" "+John.address);
	
	}

}
