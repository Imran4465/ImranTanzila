package codding_practice;

public class Remove_String_Duplicate {
	
	public static void main(String[] args) {
		String name = "madam";
		System.out.println("Before deletion: " + name);
		//so first we are creating an object of String buffer class
		StringBuilder obj = new StringBuilder(name);
		//we are using nested loop to compare duplicate character of strings
		 for(int i = 0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {
					obj.deleteCharAt(j);
				}
			}
		}
		 System.out.println("after deletion: " + obj);
	}
	

}
