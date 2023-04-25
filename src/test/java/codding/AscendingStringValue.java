package codding;

import java.util.SortedSet;
import java.util.TreeSet;

public class AscendingStringValue {
	
	public static void main(String[] args) {
		
	
	//public static void withoutusinginbuildmethodsortStringinASCOrder() {

		// SortedSet = Interface (Auto sorting order)
		// set = Instance
		SortedSet<String> set = new TreeSet<String>();
		

		String name[] = { "Hamid", "Alam", "Mesbah", "Hash", "Masud", "Fatema" };

		for (int i = 0; i < name.length; i++) {
			set.add(name[i]);

		}
		for (Object obj : set) {
			System.out.println(obj);
		}

	}

}
