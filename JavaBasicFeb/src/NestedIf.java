 // largest of three numbers using Nested if
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a=220, b=38, c=45 ;
 if(a>b) {
 
	 if(a>c) {
		 System.out.println("a is the largest number");
	 }
	 else {
		 System.out.println("c is the largest number");
	 }
 }else {
		 if(b>c) {
			 System.out.println("b is the largest number");
		 }
		 else { 
			 System.out.println("c is the largest number");
		 }
	 
 }
	}

}
