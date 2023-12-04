import java.util.Arrays;

//insert an element (specific position) in to an array.
public class InsertElemExampl {

	public static void main(String[] args) {
	int[] my_arr= {25,14,56,15,36,56,77,18,29,49};
	//insert an element in 3rd position of the array(index->2, value 5
	int index_position=2;
	int new_value=5;
	System.out.println("Original array: "+Arrays.toString(my_arr));
	for(int i=my_arr.length-1;i>index_position;i-- ) {
		my_arr[i]=my_arr[i-1];
	}
	my_arr[index_position]=new_value;
	System.out.println("New Array: "+Arrays.toString(my_arr));
	}
 
	}


