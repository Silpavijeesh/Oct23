import java.util.Arrays;

//Find the maximum and minimum value of an array
public class ArrayMAxMinNum {

	public static void main(String[] args) {
	
 int[] array= {3,45,6,2,34,65,123,14,1};
 //first sort the array
 Arrays.sort(array);
 //print the minimum value(first number in an array)
 System.out.println("Minimum value is: "+array[0]);
 //print the maximum value (last element in an array)
 System.out.println("Maximum value is: "+array[array.length-1]);
 
	}
	}