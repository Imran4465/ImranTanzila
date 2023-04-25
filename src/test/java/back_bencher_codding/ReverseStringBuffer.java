package back_bencher_codding;

public class ReverseStringBuffer {
	public static void main(String[] args) {
		String name= "Quality";
		StringBuffer abcd= new StringBuffer(name);
		String rev=abcd.reverse().toString();
		//we are using reverse() method of the ReverseStringBuffer class.
		//This method reverse the character sequence represent by the string.
		
		System.out.println(rev);
	}
}

