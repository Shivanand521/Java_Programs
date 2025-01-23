package com.pixated.canopy.StringTest;

import org.testng.annotations.Test;

public class P_a2b2a3c1{
	@Test
	public void m1() {
		String s="a2b2a3c1";
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length-1;i++) {
			if(ch[i+1]>='1' && ch[i+1]<='9') {
				char str = ch[i+1];
				for(int j=0;j<str-48;j++) {
					System.out.print(ch[i]+"");
				}
			}
		}
	}
	@Test
	public void m2() {
	String s = "a2b2a3c1";

    for (int i = 0; i < s.length(); i += 2) {
        char c = s.charAt(i);
        int count = s.charAt(i + 1) - '0';
        System.out.print(String.valueOf(c).repeat(count));
    }
}}

