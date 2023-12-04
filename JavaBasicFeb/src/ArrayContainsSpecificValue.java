//test if array contains specific value
public class ArrayContainsSpecificValue {
 public static boolean contains(int[] arr1,int item) {
	//iterate through each element 'n' in the array 'arr'
	for(int n:arr1) {
	if(item==n) {
		return true;
	}
	}
	return false;
	
	
 }
	public static void main(String[] args) {
	int[] arr= {23,45,56,67,2,65,9};
    System.out.println(contains(arr,56));
    System.out.println(contains(arr,40));
	}

}
