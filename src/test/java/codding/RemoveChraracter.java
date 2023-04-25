package codding;

public class RemoveChraracter {
	 public static void removeCharacter() {
			String name = "radsar";

			String NewValue = name.replaceAll("s", "");

			System.out.println(NewValue);

			StringBuffer rev = new StringBuffer(NewValue);

			String reverse = rev.reverse().toString();
			System.out.println(reverse);

			System.out.println("============");
			if (NewValue.equals(reverse)) {
				System.out.println("Palindrome");
			} else {

				System.out.println("not Palindrome");

			}

		}

}
