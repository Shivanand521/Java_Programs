package String_Java_Pragrams;

import java.util.Iterator;

public class Reverse_Strin_Using_Variable {
	public static void main(String[] args) {
		String s="Shivanand";
		String rev="";
		for (int i = s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

}
