package codding;

import java.util.Arrays;

public class CompareArrays {
	
	//Compare Arrays Value
public static void main(String[] args) {
		
		int [] a= {23,56,44,34};
		int [] b= {23,56,44,34};
		int [] c= {23,46,44,24};
		
		if(Arrays.equals(a, b)) {
			if(Arrays.equals(b, c)) 
			System.out.println("same value");
		
		else {
			System.out.println(" not same value");
		}
			}
		
}
}		
		

