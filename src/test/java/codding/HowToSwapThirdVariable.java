package codding;

public class HowToSwapThirdVariable {
	
public static void main(String[] args) {
		
		//How to swap the value without third variable?
		int a=100;
		int b=200;
		
		//store a+b in a
		a=a+b;//a=300
		//store a-b in b
		b=a-b;// b=100
		//Now a=300 and b=100, so a=200
		a=a-b;// a=200
		System.out.println("a value " + a);
		System.out.println("b value " + b);

}
}