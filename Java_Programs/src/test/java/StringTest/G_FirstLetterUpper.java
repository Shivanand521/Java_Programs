package StringTest;

import org.testng.annotations.Test;

public class G_FirstLetterUpper {
	@Test
	public void m1() {
	    String s = "java is a language";
	    String a[] = s.split(" ");
	    for (int i = 0; i < a.length; i++) {
	        String s1 = a[i];
	        System.out.print(Character.toUpperCase(s1.charAt(0)) + s1.substring(1) + " ");
	    }
	}
}

