package StringTest;

import org.testng.annotations.Test;

public class I_SwapString {
	@Test
	public void s() {
	String str1 = "Hello";
    String str2 = "World";
    
    str1 = str1 + str2;
    str2 = str1.substring(0, str1.length() - str2.length());
    str1 = str1.substring(str2.length());
    
    System.out.println("After swapping:" +str1 +" "+str2);
    }
@Test
public void s1() {
String str1 = "Hello";
String str2 = "World";

str1 = str1 + str2;
str2 = str1.replace(str2, "");
str1 = str1.replace(str2, "");

System.out.println("After swapping:" +str1 +" "+str2);
}
	
}

