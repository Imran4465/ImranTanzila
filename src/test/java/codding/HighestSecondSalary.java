package codding;

import java.util.Arrays;

public class HighestSecondSalary {
	public static void main(String[] args) {
		
		int num[]= {5,9,20,70,90,95};
		 int n=num.length;
		 Arrays.sort(num);
		 System.out.println("My Second Highest Number:"+num[n-2]);
	}

}
