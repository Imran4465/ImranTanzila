package codding_practice;

import java.util.HashMap;

public class Occuring_Number {

	

	public static void main(String[] args) {
		
	//declare signal array dimension.
	int num[]={2,2,2,3,3,4,5,6,6,8,1,1,44,55,55};
	
	//Haspmap to handle a key and value pair.
	HashMap<Integer,Integer> countNumber = new HashMap<>();
	
	//use loop through handle all the numbers in array
	for(int c: num) {
		
		//inside the condition with the help of hashpmap object 
		//i call the containskey method inside the parenthesis i call 
		// the c.
		if(countNumber.containsKey(c)) {
			countNumber.put(c, countNumber.get(c)+1);
		}
		
		else {
			countNumber.put(c, 1);
		}
	}
	System.out.println(countNumber);
	
	
		
	}
}
