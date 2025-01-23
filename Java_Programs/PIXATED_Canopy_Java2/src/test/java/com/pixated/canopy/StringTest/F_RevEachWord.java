package com.pixated.canopy.StringTest;

import org.testng.annotations.Test;

public class F_RevEachWord {
	@Test
	public void m1() {
		String sentence = "gd mrng betu";
		 String[] words = sentence.split(" ");
	        StringBuilder reversedSentence = new StringBuilder();

	        for (String word : words) {
	            reversedSentence.append(new StringBuilder(word).reverse()).append(" ");
	        }

	        System.out.println("Reversed each word: " + reversedSentence);
	    }
	@Test
		public void m2() {
		    String sentence = "gd mrng betu";
		    String[] words = sentence.split(" ");

		    for (String word : words) {
		        for (int i = word.length() - 1; i >= 0; i--) {
		            System.out.print(word.charAt(i));
		        }
		        System.out.print(" "); 
		        }
		}
	@Test
	public void m3() {
	    String sentence = "gd mrng betu";
	    String[] words = sentence.split(" ");
	    String rev="";
	    for(int i = words.length - 1; i >= 0; i-- ) {
	    	rev=rev+words[i]+" ";
	    }
	    System.out.println(rev);
	}		   
}

