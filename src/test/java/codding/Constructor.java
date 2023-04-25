package codding;

public class Constructor {
	String num;
	//Default
	public Constructor() {
		
	}
	//Parameterize
	public Constructor(String name) {
		this.num=name;
		System.out.println(name);
	}
	public static void main(String[] args) {
		Constructor obj =new Constructor("Shakil");
	}
	
	//What is the constructor?
	//constructor is special type of method, whenever we create constactor value invoke 
	//implicitly
	//In oder to create constructor we have to create many rules
	//1.same as class name
	//2.There is no void
	//3.we can't call constructor,
	
	//What is advantage of constructor?
	// its remove the null value
	//constructor we can create default and parameter constructor
	//Overloading is possible overriding is not possible
	
	//Why do u need default constructor?
	// To remove the null value
	
	//Why we need parameter constructor?
	//To add or change the run time value.
	

	


}
