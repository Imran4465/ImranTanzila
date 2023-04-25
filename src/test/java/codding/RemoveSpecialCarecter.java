package codding;

public class RemoveSpecialCarecter {
public static void main(String[] args) {
	
	String yourString ="Moh#@%$^$amme$^dAlam";
	String  result = yourString.replaceAll("[^\\w\\s]","");//^\\w\\s
	System.out.println(result);
	
}
}
