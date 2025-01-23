package String_Java_Pragrams;

public class No_Of_Occurance_Of_Words_InString {
	public static void main(String[] args) {
		String s = "My name is Shiva Army";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
