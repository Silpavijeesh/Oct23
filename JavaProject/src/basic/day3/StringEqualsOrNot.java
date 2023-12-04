package basic.day3;
//check if two strings are the same.Ignoring their cases
public class StringEqualsOrNot {

	public static void main(String[] args) {
      String a="Ram";
      String b="ram";
      //System.out.println(a.equals(b)); false
      System.out.println(a.equalsIgnoreCase(b));

	}

}
