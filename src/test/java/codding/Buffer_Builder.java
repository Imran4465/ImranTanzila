package codding;

public class Buffer_Builder {
	public static void main(String[] args) {
		String name= "Aquifa";
		String name1= "Aquifa"; //it will be stored in string pool (replace old space)
//How to compare two string	//== (boolean)
		System.out.println(name==name1); //true
		//second method with equal method
		//System.out.println(name.equals(name1));			
		String Anamika = new String("Aquifa");
		String Masood = new String("Aquifa"); //it will be stored in heap memory
		System.out.println(Anamika==Masood);	//false		
//If I try to compare the object with the help of "==", we get the return false 
//If try to compare the object with the help of "equals", we get the return true  I 
		//Variable and Object level both can be compared with "equal method"
		//but "==" can only handle variable level. 			
		//System.out.println(Anamika.equals(Masood));	//true			
	}

}
