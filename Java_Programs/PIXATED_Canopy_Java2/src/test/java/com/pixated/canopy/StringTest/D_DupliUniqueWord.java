package com.pixated.canopy.StringTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class D_DupliUniqueWord {
	@Test
	public void dupliWords() {
	    String s = "hii gd mrng vry gd mrng";
	    String[] words = s.split(" ");
	    Map<String, Integer> wordCount = new LinkedHashMap<>();

	    for (String word : words) {
	        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	    }

	    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	        if (entry.getValue() > 1) {
	            System.out.print(entry.getKey() + " "); 
	            }
	    }
	}
	@Test
	public void uniqueWords() {
	    String s = "hii gd mrng vry gd mrng";
	    String[] words = s.split(" ");
	    Map<String, Integer> wordCount = new HashMap<>();

	    for (String word : words) {
	        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	    }

	    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	        if (entry.getValue() == 1) {
	            System.out.print(entry.getKey() + " "); 
	            }
	    }
	}
}

