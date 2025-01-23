package com.pixated.canopy.StringTest;

import org.testng.annotations.Test;

public class M_RevSentence {
	@Test
	public void revS() {
		String s = "Hello world from OpenAI";
		// OutPut: IAnepO morf dlrow olleH
		String rev="";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		System.out.println(rev);
	}

	@Test
	public void rev() {
		String sentence = "Hello world from OpenAI";
		// OutPut: OpenAI from world Hello
		String[] words = sentence.split(" ");
		String reversedSentence = "";

		for (int i = words.length - 1; i >= 0; i--) {
			reversedSentence += words[i]+" ";
		}
		System.out.println(reversedSentence);
	}
	@Test
	public void rev2() {
	    String sentence = "Hello world from OpenAI";
	 // OutPut: olleH dlrow morf IAnepO
	    String[] words = sentence.split(" ");

	    for (String word : words) {
	        for (int i = word.length() - 1; i >= 0; i--) {
	            System.out.print(word.charAt(i));
	        }
	        System.out.print(" "); 
	        }
	}
}