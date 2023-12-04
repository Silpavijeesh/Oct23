import java.util.Arrays;

//remove specific element from an array
public class RemoveElementExample2 {

	public static void main(String[] args) {
		int[] my_arr={25,14,3,13,67,37,24,18,29};
		System.out.println("orignal array is: "+ Arrays.toString(my_arr));
				
	//remove the second element-> index1,value-> 14	of the array	
		int removeIndex=1;
		for(int i=removeIndex;i<my_arr.length-1;i++) {
			my_arr[i]=my_arr[i+1];
		}
		//we cannot alter the size of the array. After removal, the last and second last element in the array will exist twice.
		System.out.println("After removing the second element: "+Arrays.toString(my_arr));
		}
		
}		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	


