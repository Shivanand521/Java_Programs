package com.pixated.canopy.StringTest;

import org.testng.annotations.Test;

public class A_Rev_String {
	@Test
	public void revUsingVariable() {
		String s="java";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
	@Test
	public void revWithOutVariable() {
		String s="Java";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	@Test
	public void revUsingRecurssion() {
		
	}
	@Test
	public void rev() {
		 String s = "CTCa";
		    String rev = new StringBuilder(s).reverse().toString();
		    System.out.println(rev);
	}
}

