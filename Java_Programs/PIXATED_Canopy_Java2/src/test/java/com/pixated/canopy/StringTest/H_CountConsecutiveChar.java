package com.pixated.canopy.StringTest;

import org.testng.annotations.Test;

public class H_CountConsecutiveChar {
	@Test
	public void m1() {
	    String s = "aaabbrrrraabbbbb";
	    int count = 1;
	    String op = "";
	    
	    for (int i = 0; i < s.length() - 1; i++) {
	        if (s.charAt(i) == s.charAt(i + 1)) 
	            count++;
	         else 
	            op = op + s.charAt(i) + count;
	            count = 1;
	    }
	    op = op + s.charAt(s.length() - 1) + count;
	    
	    System.out.println(op);
	}
	@Test
	public void m2() {
	String input = "aabbaaac";
    String result = "";
    int count = 1;

    for (int i = 1; i <= input.length(); i++) {
        if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
            count++;
        } else {
            result += input.charAt(i - 1) + String.valueOf(count);
            count = 1;
        }
    }

    System.out.println(result);
}
}

