package basic.day3;
//java pgm to capitalize first letter of each word in a given string
public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {
		String reqStr=" ";
		String str="i am going to school";
		String[] arr=str.split(" ");//to convert the first character to uppercase we need to split
		 //each word based on space.
         for(int i=0;i<arr.length;i++) {
        	char c=arr[i].charAt(0); //our requirement is to get first character of every word(i a g t s)
        	String c1=String.valueOf(c).toUpperCase();//(I A G T S) 
       //we can append the rest of the things.
        	String sub=arr[i].substring(1); // index 1.am(here 'm' is index 1.)
        	 reqStr=reqStr+c1+sub+" ";
         }
        	 System.out.print(reqStr.trim());//the last space after school,will not come after using trim().
        	 
        	 
         }
	}


