package codding_practice;

public class Vowel_uperCase {

	

	
		public static void main(String[] args) {
			
			String value = "my name is bankim";
			System.out.println(convertToUppercaseVowels(value));
		}
		
		public static String convertToUppercaseVowels(String value) {
		    char[] characters = value.toCharArray();
		    for (int i = 0; i < characters.length; i++) {
		        char c = characters[i];
		        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
		            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
		            characters[i] = Character.toUpperCase(c);
		        }
		    }
		    return new String(characters);
		}


	}
	
	
	

