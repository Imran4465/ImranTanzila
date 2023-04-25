package codding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupliValue {

public static void main(String[] args) {
		
		int [] number = {100,200,300,100,200,300};
		
		Arrays.sort(number);  // 100,200,300,300 
		
		
		Set<Integer>  numbers = new HashSet<Integer>();
		
		for(int newNum : number) {
			numbers.add(newNum); //100,200,300
		}
		
		List<Integer> secondHighest = new ArrayList<>(numbers); //100,200,300  |0|1|2|3
		                          
		int secondIndex  = secondHighest.size(); //3
		
		System.out.println(secondHighest.get(secondIndex-2)); // 1->200
		
		
	
		
}
}
