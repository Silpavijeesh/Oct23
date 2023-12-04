import java.util.Scanner;
//java pgm to find the first big,second big and third biggest number
public class FirstMaxSmaxThMax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int[]array= new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<array.length;i++) {
	    array[i]=sc.nextInt();
		}
       int max=0;
       int sMax=0;
       int thMax=0;
       for(int i=0;i<array.length;i++) {
    	   if(max<array[i]) {
    		   thMax=sMax;
    		   sMax=max;
    		   max=array[i];
    	   }
    	   else if(sMax<array[i]) {
    		   thMax=sMax;
    		   sMax=array[i];
    	   }
    	   else if(thMax<array[i]) {
    		   thMax=array[i];
    	   }
       }
    	   
       System.out.println( "The first maximum number in the given array is: "+max);
       System.out.println("The second maximum number in the given array is: "+sMax);
       System.out.println("The third maximum number in the given array is: "+thMax);

	}

}
