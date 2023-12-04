package basic.day5Assignments;
//imoport java.util.InputMismatchException;
import java.util.Scanner;


public class Exception {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in); 
		System.out.println("Enter even number");
        int n=sc.nextInt();
        if(n%2 == 0) {
        System.out.println("Even number");
	}

}
}