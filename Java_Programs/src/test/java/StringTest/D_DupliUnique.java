package StringTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class D_DupliUnique {
	@Test
	public void dupli() {
	    String s = "cuttack";
	    Map<Character, Integer> charCount = new LinkedHashMap<>();
	    
	    for (char c : s.toCharArray()) {
	        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	    }
	    
	    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	        if (entry.getValue() > 1) {
	            System.out.print(entry.getKey());
	        }
	    }
	}
	@Test
	public void dupli2() {
	    String s = "cuttack";
	    int[] charCount = new int[256];

	    for (char c : s.toCharArray()) {
	        charCount[c]++;
	    }

	    for (int i = 0; i < charCount.length; i++) {
	        if (charCount[i] > 1) {
	            System.out.print((char) i);
	        }
	    }
	}
	@Test
	public void unique() {
	    String s = "cuttack";
	    Map<Character, Integer> charCount = new LinkedHashMap<>();
	    
	    for (char c : s.toCharArray()) {
	        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	    }
	    
	    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	        if (entry.getValue() == 1) {
	            System.out.print(entry.getKey());
	        }
	    }
	}
}

