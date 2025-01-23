package String_Java_Pragrams;

public class Reverse_string_Without_reversing_Space {
	public static void main(String[] args) {
		String s="I love Hanuman";
		String s1=s.replaceAll(" "," ");
		String rev=" ";
		int last=s.length()-1; // get the char from the last position
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)==' ') {     // if string space as it as add space 
				rev=rev+s.charAt(i);
				}
			else {
				rev=rev+s1.charAt(last); // if not space in original string we can rev and add the without replace string
				last--;
						
			}
			
		}
		System.out.println(rev);
	}

}
