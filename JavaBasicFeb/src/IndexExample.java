//java pgm to find the index of an array element in N elements.
public class IndexExample {
	public static int findIndex(int[] arr,int t) {
		//if array is null
		if(arr==null) {
			return -1;
		}
		//find the length of the array
		{
			int len=arr.length;
			int i=0;
			//traverse in the array
			while(i<len) {
				//if the 'i'th element is 't', then return the index
				if(arr[i]==t) {
					return i;
				}
				else {
					i=i+1;
				}
			}
			return -1;
		}
		}
	public static void main(String[] args) {
		int[] my_array= {5,4,6,7,3,1,9,11,7,6,8};
	//find the index of 5
		System.out.println("Index position of 5 is:"+findIndex(my_array,5));
		//find index of 7
		System.out.println("Index position of 7 is: "+findIndex(my_array,7));

	}

}
