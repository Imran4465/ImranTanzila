package codding;

public class Remove_Character_And_Reverse_String {
	
	public static void main(String[] args) {
		
		
	String name="SmartTech";
	String rev="";
	String newValue	=name.replaceAll("a", "");//SmrtTech
	
	
	
	//System.out.println(newValue);
	//StringBuffer rev =new StringBuffer(newValue);
	//String reverse =rev.reverse().toString();
	//System.out.println(reverse);
	
	for( int i=newValue.length()-1;i>=0;i--) {
		rev=rev+newValue.charAt(i);
	
	}
	System.out.println(rev);
}
}