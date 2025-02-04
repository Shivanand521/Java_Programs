package String_Java_Pragrams;
import org.testng.annotations.Test;

public class Reverse_Strin_Using_Variable {
	@Test
	public void Reverse_Strin_Using_Variabl() {

		String s = "Shivanand";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
	}

	@Test
	public void reverseString_Using_InbuiltMethod() {

		// Reverse string using inbuilt method
		String s = "shivanand";
		StringBuilder sb = new StringBuilder(s);

		System.out.println(sb.reverse().toString());
	}
	
	@Test
	public void reverseString() {
		String s="Shivanand";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
