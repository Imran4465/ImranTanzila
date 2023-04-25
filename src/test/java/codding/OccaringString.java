package codding;

import java.util.HashMap;
import java.util.Map;

public class OccaringString {

	
	
	public static void main(String[] arg) {
		String name ="nizamuddin";
		// Creating a HashMap containing char as a key and occurrences as a value
		Map<Character, Integer> rename = new HashMap<Character, Integer>();
		// Converting given string to char array
		char[] word = name.toCharArray();
		// checking each char of word
		for(char c:word) {
			
			if(rename.containsKey(c)) {
		// If char is present in rename, incrementing it's count by 1
				rename.put(c, rename.get(c) + 1);
			} else {
		// If char is not present in rename, putting this char to rename with 1 as it's value
				rename.put(c, 1);
			}		
		}
		// Printing the charCountMap
		for (Map.Entry entry : rename.entrySet()) {
		System.out.println("Key is: " + entry.getKey() + " <=AND=> " + "Value is: " + entry.getValue());
		}
	}
	
}
