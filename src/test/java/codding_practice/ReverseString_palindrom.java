package codding_practice;

public class ReverseString_palindrom {

	public static void main(String[] args) {
		String name = "infosys";
		//String name1="LeVEL";
		String mt = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			mt = mt + name.charAt(i);
			System.out.println(mt);
		}
		//if(name1.equalsIgnoreCase(mt)){
			//System.out.println("its pelindrom:"+  name);
			
		//}else {
			//System.out.println("its not pelindrom :"+ name);
		}
		//System.out.print(mt);
	}
//}
