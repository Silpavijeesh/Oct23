/*workexperience is b/w 3to5,revSal=oldSal+10% of oldSal;
workexp b/w 6 to 9,revSal=oldSal+15% of oldSal;
workexp b/w 10 to 20,revSal=oldSal+20% of oldSal;
others, revSal=oldSal+25% of oldSal;
reward=1000, is added to revSal */
import java.util.Scanner;
public class EmployeeSalary {
public static void main(String[] args) {
double revSal;
int workexp;
double reward;
Scanner sc=new Scanner(System.in);
System.out.println("Enter old Salary");
double oldSal=sc.nextDouble();
System.out.println("Enter work experience");
workexp=sc.nextInt();
System.out.println("Enter reward");
reward=sc.nextDouble();
if((workexp >=3) && (workexp<=5)){
	if (reward==1000) {
		System.out.println(revSal=1000+oldSal+ 0.10*oldSal);
	} else {
System.out.println(revSal=oldSal+ 0.10*oldSal);
}
}
else if((workexp >=6) && (workexp<=9)){
	if (reward==1000) {
		System.out.println(revSal=1000+oldSal+ 0.15*oldSal);
	}
	else {
System.out.println(revSal=oldSal+ 0.15*oldSal);
}
}
else if((workexp >=10) && (workexp<=20)){
	if (reward==1000) {
		System.out.println(revSal=1000+oldSal+ 0.20*oldSal);
	}
	else {
System.out.println(revSal=oldSal+ 0.20*oldSal);
}
}
else {
	System.out.println(revSal=oldSal+0.25*oldSal);
}


}

}
