package codding;



	public class FindDuplicate {
	
	public static void main(String[] args) {
		
	
		String name[] = {"imran","hamid","masud","fatema","fatema"};
		for(int i=0;i<name.length;i++) {
			for(int j=i+1;j<name.length;i++) {
			if(name[j]==name[i]) {
				System.out.println("duplicate value:"+ name[j]);
			}
		}
	}
	}
}