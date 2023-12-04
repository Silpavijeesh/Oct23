package basic.day3;

public class countNumbOfWords {

	public static void main(String[] args) {
		String str="welcome to my house";
		 System.out.println(str);
			int count=1;
			
			for(int i=0; i<str.length()-1;i++)
			{
	 		if((str.charAt(i) == ' ') && (str.charAt(i+1) !=' '))
	          {
					count++;
				}
			}
			System.out.println("Number of words in a string: "+count);
		}
}

	


