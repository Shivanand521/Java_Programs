package String_Java_Pragrams;

public class Remove_Or_Distinct_Duplicates_String {
	public static void main(String[] args) {
		String s="aabbcdeff";
		String d="";
		for (int i = 0; i < s.length(); i++) {
			if (d.indexOf(s.charAt(i))==-1) {
				d=d+s.charAt(i);
				
			}	
		}
		System.out.println(d);
	}

}
