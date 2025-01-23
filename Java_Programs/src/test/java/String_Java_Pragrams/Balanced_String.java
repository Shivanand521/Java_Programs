package String_Java_Pragrams;

import java.util.ArrayList;

public class Balanced_String {
	
	public static void main(String[] args) {
		String s="([{}])";
		ArrayList<Character> list = new ArrayList();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(list.size()>0 && 
					((ch=='}' && list.get(list.size()-1)=='{')
					||(ch==']'&& list.get(list.size()-1)=='[')
					|| (ch==')'&& list.get(list.size()-1)=='('))){
				list.remove(list.size()-1);
			}
			else
				list.add(ch);
			}
		if(list.isEmpty()) {
			System.out.println("String is Balanced");
		}
		else
			System.out.println("String is not balanced");

	}


}
