package codding_practice;

public class Reverse_Int {

	public static void main(String[] args) {
		
	
	int a = 1234567;
	int reversed = 0;

	for (int i = a; i != 0; i /= 10) {
	    reversed = reversed * 10 + i % 10;
	}

	System.out.println("Original value: " + a);
	System.out.println("Reversed value: " + reversed);

}
}