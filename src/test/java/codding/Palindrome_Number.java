package codding;

public class Palindrome_Number {
	public static void main(String[] args) {
		String name="MOM";
		StringBuffer rev=new StringBuffer(name);
		String text=rev.reverse().toString();
		System.out.println("After reverse:"+text);
		if(name.equals(text)) {
			System.out.println("This is a Palindrome number ");
		}
		else {
			System.out.println("This is not a Palindrome number: ");
		}
		}


}
