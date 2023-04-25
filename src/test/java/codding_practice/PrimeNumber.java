package codding_practice;

public class PrimeNumber {

	public static void main(String[] args) {

		int number = 11;

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {//(%)Modulus
				System.out.println("This is not Prime number: "+ number);
        } 
			else {

				System.out.println("This is prime number:" + number);
			}break;
			
		
		}

	}

}


