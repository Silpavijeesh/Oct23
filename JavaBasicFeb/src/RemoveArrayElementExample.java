import java.util.Scanner;

// java pgm to remove specific element from an array
public class RemoveArrayElementExample {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n; //array size declaration
	System.out.println("Enter the size of the array: ");
	n=sc.nextInt();//array size initialization.
	int[] arr=new int[n];// array declaration
	System.out.println("Enter the elements of the array: ");
	for(int i=0;i<arr.length;i++) { //Array initialization
	arr[i]=sc.nextInt();	
	}
	
	System.out.println("Enter the element you want to remove:");
	int ele=sc.nextInt();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==ele) { //if element found
			//shifting elements
			for(int j=i;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			break;
		}
	}
	System.out.println("Elements after deletion: ");
	for(int i=0;i<arr.length-1;i++) {
		System.out.println(arr[i]+" ");
		sc.close();
	}

	}

}
