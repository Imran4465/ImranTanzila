package codding_practice;

public class Fibbonacci {

	public static void main(String[] args) {

		int maxNumber = 10;
		int previousNumber = 0;
		int nextNumber = 1;

		// System.out.println("Fibinacci series " + maxNumber + " " + " number");
		// System.out.println(maxNumber);

		for (int i = 1; i <= maxNumber; i++) {
			// System.out.print(previousNumber + " ");
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;

			nextNumber = sum;
			System.out.print(previousNumber + " ");

		}

	}

}
