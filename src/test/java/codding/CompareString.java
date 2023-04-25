package codding;

public class CompareString {
	
	public static void main(String[] args) {
		String name= "Aquifa";
		String name1= "Aquifa";

		//How to compare two string
		//== (boolean)
		//System.out.println(name==name1);
		//second method with equal method
		//System.out.println(name.equals(name1));
		
		String Anamika = new String("Aquifa");
		String Masood = new String("Aquifa");
		System.out.println(Anamika==Masood);
		
		//If I try to compare the object with the help of "==", we get the return false 
		//If try to compare the object with the help of "equals", we get the return true  I 
		//Variable and Object level both can be compared with "equal method" but "==" can only handle variable level. 
		
		System.out.println(Anamika.equals(Masood));
		
		
		
		
	}
}
