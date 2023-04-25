package codding;

public class Remove_reverse {
	
	
		
		// Remove a specific character, then reverse
		
		public static void main(String[] args) {
			
			String s= "MSOMS".toLowerCase();
			
			//String remove="s".toLowerCase();
			
			// Remove specific character
			String newString=s.replaceAll("s","");
			
			System.out.println("String After Remove: "+newString);
			
			 //Reverse
			String rev="";
			for(int i=newString.length()-1;i>=0;i--) {
				rev=rev+newString.charAt(i);
			}
			
			System.out.println("Reversed String: "+rev);
		}

}
