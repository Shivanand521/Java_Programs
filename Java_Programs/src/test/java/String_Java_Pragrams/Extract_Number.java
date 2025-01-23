package String_Java_Pragrams;

import org.testng.annotations.Test;

public class Extract_Number {
	@Test
	public void extractNum() {
	String s="Before 6Pm (50)";
	int a=s.indexOf('(');
	String s1=s.substring(a);
	for(int i=0;i<s1.length();i++) {
		char ch=s1.charAt(i);
		if(ch>='0' && ch<='9') {
			System.out.print(ch);
		}
	}

}
}