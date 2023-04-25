package codding;

import org.testng.annotations.Test;

public class RemoveCharacter {
	
	@Test
	 public static void removeCharacter() {
			String name = "radsar";

			String newValue = name.replaceAll("s","");

			//System.out.println(newValue);

			StringBuffer rev = new StringBuffer(newValue);

			String reverse = rev.reverse().toString();
			System.out.println(reverse);

			//System.out.println("============");
			//if (newValue.equals(reverse)) {
				//System.out.println("Palindrome");
			//} else {

				//System.out.println("not Palindrome");

			}

		}


