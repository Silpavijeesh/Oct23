
public class ReverseWordInString {

	public static void main(String[] args) {
		
     String str= "Welcome To Java";
     String[] words=str.split(" ");
     String revString="";
     for(int i=0;i<words.length;i++) {
    	 String word=words[i];
    	 String revword="";
    	 for(int j=word.length()-1;j>=0;j--) {
    		 
    		 revword=revword+word.charAt(j);
    	 }
    	 revString = revString+ revword+ " ";
    	 
     }
     System.out.println(revString);
	}

}
  