package com.pixated.canopy.StringTest;

import org.testng.annotations.Test;

public class N_AddNumberString {
	@Test
	public void m() {
		String s="Ja2v3a5";
		 int sum=0;
		 for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				 int n=s.charAt(i)-48;
				 sum=sum+n;
			 }
		 }
		 System.out.println(sum);
	}
}

