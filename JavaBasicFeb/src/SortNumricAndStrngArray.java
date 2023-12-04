import java.util.Arrays;

public class SortNumricAndStrngArray {

	public static void main(String[] args) {
	int[] arraydata1= {23,44,33,11,3,17,15};
	String[] arraydata2= {"john","car","sam","bike","fan","abi"};
	System.out.println("Original value: "+Arrays.toString(arraydata1));
	Arrays.sort(arraydata1);
	System.out.println("Sorted value: "+Arrays.toString(arraydata1));
	System.out.println("Original value: "+Arrays.toString(arraydata2));
	Arrays.sort(arraydata2);
	System.out.println("Sorted value: "+Arrays.toString(arraydata2));

	}

}
