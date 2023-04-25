package codding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class For_Each_Loop {
		
			
		
		public static void main(String[] args) {
			
			Set<String> set= new HashSet<>(Arrays.asList("Java", "Selenium", "Cucumber"));
			set.forEach(System.out::println);
			
		}

}
