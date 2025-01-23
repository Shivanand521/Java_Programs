package StringTest;

import org.testng.annotations.Test;

public class B_Palindrome {
	@Test
	public void palindrome() {
		String s="CTC";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	@Test
	public void palin() {
	    String s = "CTC";
	    String rev = new StringBuilder(s).reverse().toString();
	    if (rev.equals(s)) {
	        System.out.println("Palindrome");
	    } else {
	        System.out.println("Not Palindrome");
	    }
	}
}

