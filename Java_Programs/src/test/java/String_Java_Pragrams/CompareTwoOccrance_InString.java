package String_Java_Pragrams;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CompareTwoOccrance_InString {
	@Test
	public void test() {

		// import java.util.*;
		String s = "aabbcccccccccccc";
		String s1 = "aaabbbcccc";

		// output:=====>> {a=3, b=3, c=12}

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<>();

		// Count occurrences of characters in s
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		// Count occurrences of characters in s1
		for (int i = 0; i < s1.length(); i++) {
			char ch2 = s1.charAt(i);
			if (map2.containsKey(ch2)) {
				map2.put(ch2, map2.get(ch2) + 1);
			} else {
				map2.put(ch2, 1);
			}
		}

		// Store the maximum count of each character in result map
		LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
		for (char key : map.keySet()) {
			int value1 = map.get(key);
			int value2 = map2.get(key);
			result.put(key, Math.max(value1, value2));
		}
		for (char key : map2.keySet()) {
			if (!result.containsKey(key)) {
				result.put(key, map2.get(key));
			}
		}
		System.out.println(result);
	}
	
	// @nd  CompareTwoOccrance_Print_Highest_Character
	@Test
	public void CompareTwoOccrance_Print_Highest_Char() {
		
		        String s = "aabbcccccccccccc";
		        String s1 = "aaabbbcccc";
		        
		        // output :======>>>> Character counts: {a=3, b=3, c=12}
		       //                     Highest occurring character: c (12 times)
		        
		        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		        LinkedHashMap<Character, Integer> map2 = new LinkedHashMap<>();

		        // Count occurrences of characters in s
		        for (char ch : s.toCharArray()) {
		            map.put(ch, map.getOrDefault(ch, 0) + 1);
		        }

		        // Count occurrences of characters in s1
		        for (char ch2 : s1.toCharArray()) {
		            map2.put(ch2, map2.getOrDefault(ch2, 0) + 1);
		        }

		        // Store the maximum count of each character in result map
		        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
		        for (char key : map.keySet()) {
		            int value1 = map.get(key);
		            int value2 = map2.getOrDefault(key, 0);  // Avoid NullPointerException
		            result.put(key, Math.max(value1, value2));
		        }
		        
		        // Add remaining characters from map2 that are not in result
		        for (char key : map2.keySet()) {
		            result.putIfAbsent(key, map2.get(key));
		        }

		        // Find the character with the highest occurrence
		        char highestChar = '\0';
		        int maxCount = 0;

		        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
		            if (entry.getValue() > maxCount) {
		                maxCount = entry.getValue();
		                highestChar = entry.getKey();
		            }
		        }

		        System.out.println("Character counts: " + result);
		        System.out.println("Highest occurring character: " + highestChar + " (" + maxCount + " times)");


	}
}