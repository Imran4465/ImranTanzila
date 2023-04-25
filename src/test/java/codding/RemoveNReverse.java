package codding;

public class RemoveNReverse {
	
public static void main(String[] args) {
		
		String s= "MSOMS".toLowerCase();
		
		String remove="s".toLowerCase();
		
		String newString=s.replaceAll(remove, "");
		
		System.out.println("String After Remove: "+newString);
		
		String rev="";
		for(int i=newString.length()-1;i>=0;i--) {
			rev=rev+newString.charAt(i);
		}
		
		System.out.println("Reversed String: "+rev);
	}




}
