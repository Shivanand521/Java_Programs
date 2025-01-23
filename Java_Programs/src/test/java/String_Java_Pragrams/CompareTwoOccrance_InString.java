package String_Java_Pragrams;



	import java.util.LinkedHashMap;

import org.testng.annotations.Test;

	public class CompareTwoOccrance_InString {
		@Test
		public void test() {
			String name = "hellooo welcomeeehh";
			String[] s = name.split(" ");
			String str = s[0], str2 = s[1];
			LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
			for (int i = 0; i < str.length(); i++) {
				if (map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
				} else {
					map.put(str.charAt(i), 1);
				}
			}

			LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();
			for (int i = 0; i < str2.length(); i++) {
				if (map2.containsKey(str2.charAt(i))) {
					map2.put(str2.charAt(i), map2.get(str2.charAt(i)) + 1);
				} else {
					map2.put(str2.charAt(i), 1);
				}
			}

			//System.out.println(map + "\n" + map2);
			LinkedHashMap<Character, Integer> result = new LinkedHashMap();
			for(char key : map.keySet()) {
				int value1 = map.get(key);
				int value2 = map2.getOrDefault(key, 0);
				result.put(key, Math.max(value1, value2));
			}
			
			for(char key : map2.keySet()) {
				if(!result.containsKey(key)) {
					result.put(key, map2.get(key));
				}
			}
			System.out.println(result);

		}
	}
	
