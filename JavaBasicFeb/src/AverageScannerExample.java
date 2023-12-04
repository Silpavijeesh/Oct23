//print the average of three numbers entered by user by creating a class named Average having a method to calculate and
//print average
import java.util.Scanner;

class Average{
	double avg;
	Average(double a,double b,double c){
		avg=(a+b+c)/3;
	}
}
public class AverageScannerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		double a1=sc.nextDouble();
		double a2=sc.nextDouble();
		double a3=sc.nextDouble();
		Average obj=new Average(a1,a2,a3);
		System.out.println("Average of three number is: "+obj.avg);

	}

}
