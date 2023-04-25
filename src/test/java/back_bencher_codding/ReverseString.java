package back_bencher_codding;

public class ReverseString {
	
	// 1st codding BackBencher 
	public static void main(String[] args) {
		String name="Bangladesh",rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
