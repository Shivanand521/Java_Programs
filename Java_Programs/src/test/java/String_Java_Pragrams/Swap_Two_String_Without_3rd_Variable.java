package String_Java_Pragrams;

import java.util.Iterator;

public class Swap_Two_String_Without_3rd_Variable {
	public static void main(String[] args) {
		String a="hi";
		String b="helloo";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
			System.out.println("a :" +a);
			System.out.println("b :" +b);
		}
	}


