package basic.day3;
//Write a java pgm to check if a given text is a rotation of another text.eg "aana" "naaa"
public class StringRotationExample {
public static void main(String[] args) {
	String str1="aana",str2="naaa";
	if(str1.length()!=str2.length()) {
		System.out.println("Second string is not a rotation of first string");
	}
	else {
		//concatenate str1 with str1 and store in str1.
		str1=str1.concat(str1);
		//check whether str2 is present in str1
		if(str1.indexOf(str2)!=-1) 
			System.out.println("Second string is a rotation of first string");
			else
				System.out.println("Second string is not a rotation of first string");
		}
			
	}
	
}

	
	
	
	


