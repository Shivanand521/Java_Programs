package String_Java_Pragrams;

import org.testng.annotations.Test;

public class Reverse_Each_Words_InString {
	@Test
	public void REverseEachWord() {
		String s = "welcome to tp office";
		
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String s1 = arr[i];
			StringBuilder sb = new StringBuilder(s1);
			System.out.print(sb.reverse() + " ");

		}
	}



@Test
public void InplaceOfSpaceUnderscore() {
	String s = "welcome to tp office";
	String arr[] = s.split(" ");
	StringBuilder result =new StringBuilder();
	
	for (int i = 0; i < arr.length; i++) {
		String s1 = arr[i];
		StringBuilder sb = new StringBuilder(s1);
		result.append(sb.reverse());
		if(i<arr.length-1) {
			result.append("_");
		}

	}
	System.out.println(result.toString());
}
}