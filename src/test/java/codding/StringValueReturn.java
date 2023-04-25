package codding;

import java.util.HashMap;

public class StringValueReturn {
	public static void main(String[] args) {
		
	
	returnValue();
	//System.out.println (reUse (new int[] {1,1,1,2,2,3,1}));
	
	//myDataStructure = countNumber(new int[] {1,1,1,2,2,3,1});
	
	int []number= {1,1,1,2,2,3,1};
	HashMap<Integer,Integer> mapCount=new HashMap<>();
	for(int c:number) {
		if(mapCount.containsKey(c)) {
			mapCount.put(c,mapCount.get(c)+1);
			
		}
		else {
			mapCount.put(c, 1);
		}
	}
	System.out.println(mapCount);
	//for(Entry<Integer, Integer> entry:mapCount.entrySet()) {
		//System.out.println(entry.getKey() + "  " + entry.getValue());
	}


/*public static int reUse(int[] numbers) {
	int count= 0;
	for(int i=0;i<numbers.length;i++) {
		int currentInt=numbers[i];
		if(currentInt==numbers[i]) {
			
		}
		count++;
	}

	
	return count;
}*/
public static HashMap<Integer,Integer> returnValue() {
	int []number= {1,1,1,2,2,3,1};
	HashMap<Integer,Integer> mapCount=new HashMap<>();
	for(int c:number) {
		if(mapCount.containsKey(c)) {
			mapCount.put(c,mapCount.get(c)+1);
			
		}
		else {
			mapCount.put(c, 1);
		}
	}
	System.out.println(mapCount);
	//for(Entry<Integer, Integer> entry:mapCount.entrySet()) {
		//System.out.println(entry.getKey() + "  " + entry.getValue());
	
	
	return mapCount;
}


}
