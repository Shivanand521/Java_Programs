package String_Java_Pragrams;

import java.util.Arrays;
import java.util.LinkedHashMap;

import org.testng.annotations.Test;

public class OccuranceOf_Words_using_String_InHashMap {
	@Test
	public void OccuranceOf_Words_using_String_() {

		String s = "hi shivanna hello shivanna hi";
		String arr[] = s.split(" ");

		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);

			} else {
				map.put(word, 1);
			}
		}
		System.out.println(map);
	}

	@Test
	public void OccuranceOfString() {

		String s = "hi hello bye hi hello bangalore";
		String arr[] = s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String word : arr) {
			word = word.toLowerCase();
			map.put(word, map.getOrDefault(word, 0) + 1);
		}

		for (String key : map.keySet()) {
			if (map.get(key) > 1);
			
			// if (map.get(key) == 1); Remove Duplicate word or Print Unique Words
			
			System.out.println(key);
		}

		System.out.println(map);
	}
}