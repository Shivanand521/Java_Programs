package Othe_Mix_Prog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import org.testng.annotations.Test;

public class Denomination {
	@Test
		public void denomination() {
		List<Integer> denominations=new ArrayList<Integer>(Arrays.asList(2000,1000,500,200,100,50,20,10,5,2,1));
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap<Integer, Integer>();
		 
		int amount=8825;
		for (Integer denomination : denominations) {
			if (amount>=denomination) {
				
				int count=amount/denomination;
				amount%=denomination;
				
				map.put(denomination, count);
		}
		}
			System.out.println(map);
		}
			
		}
		

