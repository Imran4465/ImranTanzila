package codding;

import java.util.Arrays;

public class AscendingValue {
	
	public static void main(String[] args) {
		
		String name = "acbedgf";
		char[] obj = name.toCharArray();

		Arrays.sort(obj);
		//String str = new String(obj);
		System.out.println(obj);
	}
}
