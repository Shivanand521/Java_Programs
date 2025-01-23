package com.pixated.canopy.StringTest;

import org.testng.annotations.Test;

public class K_SwapWords {
	@Test
	public void swap() {
		String sentence = "Hii sir gd mrng";
		String[] words = sentence.split(" ");
		if (words.length >= 2) {
			String temp = words[0];
			words[0] = words[words.length - 1];
			words[words.length - 1] = temp;
		}
		String result = String.join(" ", words);
		System.out.println("After swap :" + result);

	}
}
