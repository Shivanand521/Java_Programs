package String_Java_Pragrams;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class Polindrome_In_Sentence_String {
	
	
	@Test
	public void Polindrome_In_Sentence() {
	String str = "mom dad children mom";
	String[] s = str.split(" ");

	HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

	for (String name : s) {
		if (map.containsKey(name)) {
			map.put(name, map.get(name) + 1);
		} else {
			map.put(name, 1);
		}
	}
	// System.out.println(map);
	for (Entry<String, Integer> hash : map.entrySet()) {

		String temp = hash.getKey();
		char[] ch = temp.toCharArray();
		String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		if (temp.equals(rev) && hash.getValue() > 1) {
			System.out.println("Repeted palindrome is " + rev);

		}

	}
}

}


