package codding;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("banana");
		list.add("banana");
		list.add("mango");
		list.add("orange");
		list.add("grapes");
		list.add("mango");
		list.add("orange");
		list.add(null);
		list.add(null);
		//System.out.println(list.toString());
		 List<Object>removeduplicate=list.stream().distinct().collect(Collectors.toList());

		//Set<String>name=new LinkedHashSet<String>(list);
		System.out.println("After remove Duplicate :"+removeduplicate);
		
}
	}
