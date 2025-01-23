package com.pixated.canopy.StringTest;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class C_Char_Occurance {
	@Test
	public void occurance() {
		  String sentence = "gd mrng betu gd";
	        String[] words = sentence.split(" "); // Split sentence into words
	        Map<String, Integer> wordCount = new LinkedHashMap<>();

	        // Count words
	        for (String word : words) {
	            word = word.toLowerCase();
	            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
	        }

	        // Use Map.Entry for iteration
	        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	            System.out.println( entry.getKey() + " Frequency: " + entry.getValue());
	        }

}
	@Test
	public void occurance2() {
		String s = "java";
	    Map<Character, Integer> freq = new LinkedHashMap<>();
	    
	    for (char c : s.toCharArray()) {
	        freq.put(c, freq.getOrDefault(c, 0) + 1);
	    }
	    
	    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
	        System.out.println("Character: " + entry.getKey() + " Frequency: " + entry.getValue());
	    }
	}
	}

