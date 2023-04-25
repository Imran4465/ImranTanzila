package codding;

public class ReversString {
public static void main(String[] args) {
	
	String name= "Infosys", rev="";
	for( int i=name.length()-1;i>=0;i--) {
		rev=rev+name.charAt(i);
		//System.out.println(rev);
	}
	System.out.println(rev);
}

}

