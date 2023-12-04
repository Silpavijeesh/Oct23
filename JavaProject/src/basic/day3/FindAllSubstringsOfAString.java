package basic.day3;
//java pgm to find all the substrings of a given string.
public class FindAllSubstringsOfAString {
	public static void main(String[] args) {
  String str="abc"; //possible sustrings are a ab abc b bc c. 'i' is for 'a' and 'j' is for 'b'
   
  for(int i=0;i<str.length();i++) {
    	for(int j=i+1;j<=str.length();j++) {
    		
    		System.out.println(str.substring(i,j)); //i=0,j=1;0-1 print a.i=0 j=2 0-2 ab,0-3 abc,1-2 b;1-3 bc,2-3 c;
    	}
    }
	}

}
