
public class Switcch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int day=5;
   //switch statement with Integer data type
   switch(day) {
   //Case statements 
   case 1:
	   System.out.println("The day is: Monday");
	   break;
   case 2:
	   System.out.println("The day is: Tuesday");
	   break;
   case 3:
	   System.out.println("The day is: Wednesday");
	   break;
	case 4:	 
		System.out.println("The day is: Thursday");
		break;
	case 5:
		System.out.println("The day is: Friday");
		break;
	case 6:
		System.out.println("The day is : Saturday");
		break;
	case 7:
		System.out.println("The day is: Sunday");
		break;
		//default case statement
	default:
		System.out.println("The day is: Invalid");
		break;
   }
	}

}
