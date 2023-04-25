package codding;

public class SwapValue {

	

	public static void main(String[] args) {
		
		//How to swap the value without third variable
		int a=100;
		int b=200;
		
		//store a+b in a
		a=a+b;
		//store a-b in b
		b=a-b;
		//Now a=300 and b=100, so a=200
		a=a-b;
		System.out.println("a value " + a);
		System.out.println("b value " + b);
		
		

	}
}
