package StringTest;

import org.testng.annotations.Test;

public class J_SubString {
	@Test
	public void substring() {
		String s = "asit";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String substr = s.substring(i, j);
					System.out.println(substr);			}
		}
	}

	@Test
	public void subStringLength() {
		String s = "asit";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String substr = s.substring(i, j);
				if (substr.length() == 3) {
					System.out.println(substr);
				}
			}
		}
	}

	@Test
	public void palindrome() {
		String s = "asitctc";
		int n = s.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				String substr = s.substring(i, j);
				//System.out.println(substr);
				if (substr.length() == 3) {
					//System.out.println(substr);
					String temp = "";
					for (int k = substr.length() - 1; k >= 0; k--) {
						temp = temp + substr.charAt(k);
					}
					if (temp.equalsIgnoreCase(substr)) 
						System.out.println(substr + " : is palindrome string");
					/*
					 * else { System.out.println(substr + " : is not palindrome string"); }
					 */
				}
			}
		}
	}
}
