package String_Java_Pragrams;

import org.testng.annotations.Test;

public class Replace_Char_InString {

	@Test
	public void Replace_Char_In_String() {

		String s = "shivanand";   // o/p:==> Phivanand
		char oldchar = 's';
		char newchar = 'P';
		String s1 = s.replace(oldchar, newchar);
		System.out.println(s1);
	}

	@Test
	public void Count_Char_InString() {
		
		String s="shivanand";    // o/p:==> 9
		int count=s.length();
		System.out.println(count);

	}
}