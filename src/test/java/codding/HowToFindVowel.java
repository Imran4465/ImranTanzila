package codding;

public class HowToFindVowel {

	
	public static void main(String[] args) {
		// How to find vowel from string

		String vowel = "The united states of america";

		for (int i = 0; i < vowel.length(); i++) {
			if (vowel.charAt(i) =='a' || vowel.charAt(i) =='e' || vowel.charAt(i) =='i' || vowel.charAt(i) == 'o'
					|| vowel.charAt(i) =='u')
				 {
				
				System.out.println(vowel.charAt(i));
			}

		}

	}

}

