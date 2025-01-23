package String_Java_Pragrams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map.Entry;


import org.testng.annotations.Test;

public class OccuranceIn_SortedOrder_String {
	
	@Test
	public void test() {
		String name = "hello welcome to bangalore";   // o/p---> 
		String[] s = name.split(" ");
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i=0;i<s.length;i++) {
			String str = s[i];
		
			for(int j=0;j<str.length();j++) {
				if(map.containsKey(str.charAt(j))) {
					map.put(str.charAt(j), map.get(str.charAt(j))+1);
				}else {
					map.put(str.charAt(j), 1);
				}
			}
		}
		 
		List<Entry<Character,Integer>> list = new ArrayList(map.entrySet());
		 
		list.sort(Entry.comparingByValue(Comparator.reverseOrder()));
		
		
		for(Entry<Character, Integer> hash:list) {
			System.out.println(hash.getKey() + " ---> "+ hash.getValue());
		}
	}

}

/*   output:::--->
e ---> 3
l ---> 3
o ---> 2
h ---> 1
w ---> 1
c ---> 1
m ---> 1 */
