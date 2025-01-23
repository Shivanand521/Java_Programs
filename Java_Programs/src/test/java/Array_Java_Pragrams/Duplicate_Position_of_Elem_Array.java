package Array_Java_Pragrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Duplicate_Position_of_Elem_Array {
	public static void main(String[] args) {
		int [] arr= {1,2,4,6,7,3,4,5,9,0,3,4,};
		LinkedHashMap<Integer, List<Integer>> map=new LinkedHashMap<Integer, List<Integer>>();
		for (int i = 0; i < arr.length; i++) {
			map.putIfAbsent(arr[i], new ArrayList<>());
			map.get(arr[i]).add(i);
			
		}
		for(HashMap.Entry<Integer, List<Integer>> entry:map.entrySet()) {
			if (entry.getValue().size()>1) {
				System.out.println(" Duplicate element " + entry.getKey() + " is " + "  Found at Position " + entry.getValue());
				
			}
		}
	}

}
