
public class Reverse {
public static void main(String[] args) {
	String original="Selenium webdriver";
	String reverse=" ";
	int length=original.length();
	System.out.println(length);
	for(int i=length-1;i>=0;i--) {
		reverse= reverse+original.charAt(i);
	}
	System.out.println(reverse);

}



}

