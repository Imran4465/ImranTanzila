package codding;

public class Palindromelooping {

public static void main(String[] args) {
		
		String name = "LOL";// total 3 char 3-1=2
		             //0=L, 1=O, 2=L for index num
		String rev1 = "";
	
		for (int i= name.length()-1; i>=0; i--) {
			
			rev1= rev1+name.charAt(i);// use to read charters at a particular index num
			
		}
		
	
		//System.out.println(rev1);
		if(name.equals(rev1)) {
			System.out.println(" It is palindrome num " + name);
		}
		else {
			System.out.println(" It is not a palidrome num " + name);
		}
		
	}
}
