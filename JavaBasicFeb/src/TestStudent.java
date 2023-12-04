//create a class named student with String variable name and integer variable roll_no.Assign the value of roll_no as 2 and 
//name as John by creating an object of the class

class Student{
	String name;
	int roll_no	;
}

public class TestStudent {
public static void main(String[] args) {
	Student s1=new Student();
	s1.name="John";
	s1.roll_no=2;
	System.out.println(s1.name+" "+s1.roll_no);
}
}
