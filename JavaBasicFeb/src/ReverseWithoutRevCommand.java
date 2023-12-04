import java.util.Scanner;
public class ReverseWithoutRevCommand {
	public static void main(String[] args) {
		System.out.println("Enter an input: ");
		Scanner sc=new Scanner(System.in);
		String original=sc.nextLine();
		 String reverse=" ";
		 for(int i=original.length()-1;i>=0;i--) {
			 reverse+=original.charAt(i);
		 }
		 System.out.println(reverse);
	
	}

}
